package com.liangfeng.study.dict.service;


import com.liangfeng.study.core.web.dto.request.GetRequestbody;
import com.liangfeng.study.core.web.dto.request.RemoveRequestbody;
import com.liangfeng.study.core.web.dto.response.AddResponsebody;
import com.liangfeng.study.dict.web.request.DictQueryRequestbody;
import com.liangfeng.study.dict.web.request.DictAddOrMdfRequestbody;
import com.liangfeng.study.dict.web.response.DictGetResponsebody;
import com.liangfeng.study.dict.web.response.DictQueryResponsebody;


/**
 * @author Liangfeng
 * @version 1.0
 * @Title: DictService
 * @Description:
 * @date 2018-06-09
 */
public interface DictService {

    /**
     * 添加字典
     * @param requestbody
     */
    AddResponsebody add(DictAddOrMdfRequestbody requestbody);

    /**
     * 修改字典
     * @param requestbody
     */
    void modify(DictAddOrMdfRequestbody requestbody);

    /**
     * 删除字典
     * @param requestbody
     */
    void remove(RemoveRequestbody requestbody);

    /**
     * 获取字典
     * @param requestbody
     * @return
     */
    DictGetResponsebody get(GetRequestbody requestbody);

    /**
     * 查询字典
     * @param requestbody
     * @return
     */
    DictQueryResponsebody query(DictQueryRequestbody requestbody);

    /**
     * 分页查询字典
     * @param requestbody
     */
    DictQueryResponsebody queryPage(DictQueryRequestbody requestbody);

}
