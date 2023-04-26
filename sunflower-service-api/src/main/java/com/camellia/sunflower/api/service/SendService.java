package com.camellia.sunflower.api.service;

import com.camellia.sunflower.api.domain.BatchSendRequest;
import com.camellia.sunflower.api.domain.SendRequest;
import com.camellia.sunflower.api.domain.SendResponse;

/**
 * 发送接口
 * @author camellia
 */
public interface SendService {

    /**
     * 单文案发送
     * @param sendRequest
     * @return
     */
    SendResponse send(SendRequest sendRequest);

    /**
     * 多文案发送
     * @param batchSendRequest
     * @return
     */
    SendResponse batchSend(BatchSendRequest batchSendRequest);
}
