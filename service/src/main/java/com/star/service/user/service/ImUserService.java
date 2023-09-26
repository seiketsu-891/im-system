package com.star.service.user.service;

import com.star.common.ResponseVO;
import com.star.service.user.model.req.ImportUserReq;

public interface ImUserService {
     ResponseVO importUser(ImportUserReq req);
}
