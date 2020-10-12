package com.beauty_design_mode.lecture13_14.auth.open;

import com.beauty_design_mode.lecture13_14.auth.ApiRequest;
import com.beauty_design_mode.lecture13_14.auth.AuthToken;
import com.beauty_design_mode.lecture13_14.auth.CredetialStorage;
import com.beauty_design_mode.lecture13_14.auth.MysqlCredetialStorage;

/**
 * @author Alan Yin
 * @date 2020/10/12
 */

public class DefaultApiAuthencatorImpl implements ApiAuthencator {

    private CredetialStorage credetialStorage;

    public DefaultApiAuthencatorImpl() {
        this.credetialStorage = new MysqlCredetialStorage();
    }

    public DefaultApiAuthencatorImpl(CredetialStorage credetialStorage) {
        this.credetialStorage = credetialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.buildFromUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String originalUrl = apiRequest.getBaseUrl();

        AuthToken clientAuthToken = new AuthToken(token, timestamp);
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is expired.");
        }

        String password = credetialStorage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.generate(originalUrl, appId, password, timestamp);
        if (!serverAuthToken.match(clientAuthToken)) {
            throw new RuntimeException("Token verfication failed.");
        }
    }
}
