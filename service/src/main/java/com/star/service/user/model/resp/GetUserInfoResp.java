package com.star.service.user.model.resp;

import com.star.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;


@Data
public class GetUserInfoResp {

    private List<ImUserDataEntity> userDataItem;

    private List<String> failUser;


}
