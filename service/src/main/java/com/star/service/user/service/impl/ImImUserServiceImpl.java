package com.star.service.user.service.impl;

import com.star.common.ResponseVO;
import com.star.service.user.dao.ImUserDataEntity;
import com.star.service.user.dao.mapper.ImUserDataMapper;
import com.star.service.user.model.req.ImportUserReq;
import com.star.service.user.model.resp.ImportUserResp;
import com.star.service.user.service.ImUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImImUserServiceImpl implements ImUserService {
    @Resource
    ImUserDataMapper imUserDataMapper;

    @Override
    public ResponseVO importUser(ImportUserReq req) {
        List<ImUserDataEntity> users = req.getUserList();
        // validation
        if(users.size()> 100){
            //
        }

        List<String> successId = new ArrayList<>();
        List<String> errorId = new ArrayList<>();
        users.forEach(user -> {
            try{
                user.setAppId(req.getAppId());
                int insert = imUserDataMapper.insert(user);
                if(insert == 1){
                    successId.add(user.getUserId());
                }
            }catch(Exception e){
                e.printStackTrace();
                errorId.add(user.getUserId());
            }
        });

        ImportUserResp resp = new ImportUserResp();
        resp.setErrorId(errorId);
        resp.setSuccessId(successId);
        return ResponseVO.successResponse(resp);
    }
}
