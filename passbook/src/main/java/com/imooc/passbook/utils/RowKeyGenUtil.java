package com.imooc.passbook.utils;

import com.imooc.passbook.vo.Feedback;
import com.imooc.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * RowKey 生成器工具类
 */
@Slf4j
public class RowKeyGenUtil {

    /**
     * 根据提供的 PassTemplate 对象生成 RowKey
     * @param passTemplate {@link PassTemplate}
     * @return String RowKey
     */
    public static String genPassTemplateRowKey(PassTemplate passTemplate){

        String passInfo = String.valueOf(passTemplate.getId()) + "_" + passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);
        log.info("GenPassTemplateRowkey: {}, {}", passInfo, rowKey);

        return rowKey;
    }

    /**
     * 根据 Feedback 构造 RowKey
     * @param feedback {@link Feedback}
     * @return String RowKey
     */
    public static String genFeedbackRowKey(Feedback feedback){

        return new StringBuilder(String.valueOf(feedback.getUserId())).reverse().toString() +
                (Long.MAX_VALUE - System.currentTimeMillis());
    }
}
