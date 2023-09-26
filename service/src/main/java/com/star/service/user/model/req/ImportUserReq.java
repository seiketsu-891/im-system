package com.star.service.user.model.req;

import com.star.common.model.RequestBase;
import com.star.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;


@Data
public class ImportUserReq extends RequestBase {
    private List<ImUserDataEntity> userList;
}
