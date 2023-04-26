package com.camellia.sunflower.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 发送接口的参数
 * batch
 *
 * @author camellia
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BatchSendRequest {
    /**
     * 执行业务类型
     *  必传，
     *  参考BusinessCode枚举
     */
    private String code;
    /**
     * 消息模板id，
     * 必传
     */
    private Long messageTemplateId;
    /**
     * 消息相关参数，必传
     */
    private List<MessageParam> messageParamList;
}
