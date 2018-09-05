package com.cyyz.cy_system.controller;
import com.cyyz.cy_system.infrastructure.result.Result;
import com.cyyz.cy_system.infrastructure.result.ResultGenerator;
import com.cyyz.cy_system.domain.model.Permission;
import com.cyyz.cy_system.service.PermissionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
* Created by Shz on 2018/08/30.
*/
@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Resource
    private PermissionService permissionService;

    @PostMapping("/add")
    public Result add(Permission permission) {
        permissionService.save(permission);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        permissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Permission permission) {
        permissionService.update(permission);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Permission permission = permissionService.findById(id);
        return ResultGenerator.genSuccessResult(permission);
    }

    @GetMapping("/list")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Permission> list = permissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
