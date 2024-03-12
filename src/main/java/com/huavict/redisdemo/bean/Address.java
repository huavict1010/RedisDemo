/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.huavict.redisdemo.bean;

/**
 * TODO
 *
 * @author l30055129
 * @since 2024-03-12 09:01
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.index.Indexed;

/**
 * 功能：地址实体类
 * 日期：2023年06月16日
 * 作者：梁辰兴
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Address {
    @Indexed
    private String country; //国家
    @Indexed
    private String city; //城市
}

