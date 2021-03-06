package com.liangfeng.study.dict.web.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Title: ImgUploadRespBody.java
 * @Description: 
 * @author Liangfeng
 * @date 2017/5/18 0018 下午 6:59
 * @version 1.0
 */
@Data
public class ImgUploadResponsebody {

    @ApiModelProperty(value = "主键", example = "1")
    private Long id;

    @ApiModelProperty(value = "url", example = "1")
    private String url;
}
