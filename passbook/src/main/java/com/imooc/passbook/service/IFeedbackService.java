package com.imooc.passbook.service;

import com.imooc.passbook.vo.Feedback;
import com.imooc.passbook.vo.Response;

/**
 * 评论功能：即用户评论相关功能实现
 */
public interface IFeedbackService {

    /**
     * 创建评论
     * @param feedback {@link Feedback}
     * @return {@link Response}
     */
    Response createFeedback(Feedback feedback);

    /**
     * 获取用户评论
     * @param userId 用户 id
     * @return {@link Response}
     */
    Response getFeedback(Long userId);
}
