package com.camellia.sunflower.api.service;

import com.camellia.sunflower.api.domain.SendRequest;
import com.camellia.sunflower.api.domain.SendResponse;

/**
 * 撤回接口
 * @author camellia
 */
public interface RecallService {
    /**
     * 根据模板id撤回消息。
     * @param:sendRequest
     * @return
     */
    SendResponse recall(SendRequest sendRequest);
}
