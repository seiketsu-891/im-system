package com.star.service.user.model.req;

import com.star.common.model.RequestBase;
import lombok.Data;


@Data
public class GetUserSequenceReq extends RequestBase {

    private String userId;

}
