package com.camellia.sunflower.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 发送或撤回接口的参数
 * @author camellia
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendRequest {
    /**
     * 执行业务类型
     * send：发送消息
     * recall：撤回消息
     */
    private String code;
    /**
     * 消息模板id【必填】
     */
    private Long messageTemplateId;
    /**
     * 业务相关的参数
     * 当业务类型为send时必填
     */
    private MessageParam messageParam;
}
