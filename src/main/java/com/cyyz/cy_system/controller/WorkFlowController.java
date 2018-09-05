package com.cyyz.cy_system.controller;

import com.cyyz.cy_system.infrastructure.result.Result;
import com.cyyz.cy_system.infrastructure.result.ResultGenerator;

import io.swagger.annotations.Api;
import org.activiti.engine.*;
import org.activiti.engine.TaskService;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SHZ
 * @Description:
 * @Date: Created in 2018-09-03 14:37
 */
@RestController
@RequestMapping("/wf")
@Api("工作流管理")
public class WorkFlowController {
    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private IdentityService identityService;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private HistoryService historyService;


    @RequestMapping("/go")
    public Result TestWorkFlow()
    {
       //User user = identityService.newUser("wangyongmin");
       //user.setLastName("王永民");
       //identityService.saveUser(user);

        return ResultGenerator.genSuccessResult( identityService.createUserQuery().list());
    }
    @GetMapping("/processes")
    public Result GetAllProcess()
    {
        //User user = identityService.newUser("wangyongmin");
        //user.setLastName("王永民");
        //identityService.saveUser(user);

        return ResultGenerator.genSuccessResult( identityService.createUserQuery().list());
    }

}
