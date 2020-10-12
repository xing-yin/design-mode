package com.beauty_design_mode.lecture13_14.auth.open;

import com.beauty_design_mode.lecture13_14.auth.ApiRequest;

/**
 * 封装所有实现细节,暴露一组给外部调用者使用的 API 接口
 *
 * @author Alan Yin
 * @date 2020/10/12
 */

public interface ApiAuthencator {

    void auth(String url);

    void auth(ApiRequest apiRequest);

}
