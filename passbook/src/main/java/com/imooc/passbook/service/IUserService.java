package com.imooc.passbook.service;

import com.imooc.passbook.vo.Response;
import com.imooc.passbook.vo.User;

/**
 * 用户服务：创建 User 服务
 */
public interface IUserService {

    /**
     * 创建用户
     * @param user {@link User}
     * @return {@link Response}
     * @throws Exception
     */
    Response createUser(User user) throws Exception;
}
