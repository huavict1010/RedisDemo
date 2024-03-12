/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.huavict.redisdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.index.Indexed;

/**
 * TODO
 *
 * @author l30055129
 * @since 2024-03-12 09:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Family {
    @Indexed
    private String type;
    @Indexed
    private String name;
}
