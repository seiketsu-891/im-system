package com.star.service.user.model;

import com.star.common.model.ClientInfo;
import lombok.Data;


@Data
public class UserStatusChangeNotifyContent extends ClientInfo {


    private String userId;

    //服务端状态 1上线 2离线
    private Integer status;



}
