package com.beauty_design_mode.lecture18.demo1;

/**
 * 需求：后台管理系统要实现删除用户的功能
 * <p>
 * 设计：由于删除用户操作很敏感、并且不是所有的用户服务都需要，可以利用接口隔离原则，单独提供一个操作有限的 UserService
 *
 * @author Alan Yin
 * @date 2021/8/11
 */

public interface RestrictedUserService {

    boolean deleteUserByCellphone(String cellphone);

    boolean deleteUserById(long id);

}
