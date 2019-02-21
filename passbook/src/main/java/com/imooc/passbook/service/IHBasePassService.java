package com.imooc.passbook.service;

import com.imooc.passbook.vo.PassTemplate;

/**
 * Pass HBase 服务
 */
public interface IHBasePassService {

    /**
     * 将 PassTemplate 写入 HBase
     * @param passTemplate {@link PassTemplate}
     * @return true/false
     */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);
}
