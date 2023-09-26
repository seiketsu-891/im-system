package com.star.service.user.controller;

import com.star.common.ResponseVO;
import com.star.service.user.model.req.ImportUserReq;
import com.star.service.user.service.ImUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("v1/user")
public class ImUserController {
    @Resource
    ImUserService imUserService;

    @PostMapping("importUser")
    public ResponseVO importUser(@RequestBody ImportUserReq req, Integer appId){
        req.setAppId(appId);
        return imUserService.importUser(req);
    }
}
