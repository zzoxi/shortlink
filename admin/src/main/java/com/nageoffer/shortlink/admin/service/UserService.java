package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 用户名存在返回True
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     * @param requestParam
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 修改用户根据用户名
     * @param requestParam
     */
    void update(@RequestBody UserUpdateReqDTO requestParam);
}
