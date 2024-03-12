/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2021. All rights reserved.
 */

package com.huavict.redisdemo.enums;

import com.huavict.redisdemo.exception.AppException;
import org.apache.commons.lang3.StringUtils;

/**
 * 信息安全分级
 */
public enum InfoSecLevel {
    NULL_OBJECT("无效值", "NULL_OBJECT"),

    TOP_SECRET("绝密", "TOP_SECRET"),

    SECRET("机密", "SECRET"),

    CONFIDENTIAL("秘密", "CONFIDENTIAL"),

    INTERNAL("内部公开", "INTERNAL"),

    PUBLIC("外部公开", "PUBLIC");

    private final String key;

    private final String value;

    InfoSecLevel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static InfoSecLevel getByKey(String key) throws AppException {
        for (InfoSecLevel infoSecLevel : values()) {
            if (StringUtils.equals(key, infoSecLevel.key)) {
                return infoSecLevel;
            }
        }
        throw new AppException("Illegal InfoSecLevel key: " + key);
    }
}
