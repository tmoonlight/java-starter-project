package com.cyyz.cy_system.controller;
import com.cyyz.cy_system.infrastructure.result.Result;
import com.cyyz.cy_system.infrastructure.result.ResultGenerator;
import com.cyyz.cy_system.domain.model.Role;
import com.cyyz.cy_system.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
* Created by Shz on 2018/08/30.
*/
@RestController
@RequestMapping("/role")
@Api("角色管理")
public class RoleController {
    @Resource
    private RoleService roleService;

    @PostMapping("/add")
    public Result add(Role role) {
        roleService.save(role);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        roleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Role role) {
        roleService.update(role);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Role role = roleService.findById(id);
        return ResultGenerator.genSuccessResult(role);
    }

    @ApiOperation(value = "角色查询-可分页查询")
    @GetMapping("/list")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Role> list = roleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
