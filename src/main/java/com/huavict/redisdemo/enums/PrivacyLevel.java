/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2021. All rights reserved.
 */

package com.huavict.redisdemo.enums;

import com.huavict.redisdemo.exception.AppException;
import org.apache.commons.lang3.StringUtils;

public enum PrivacyLevel {
    NULL_OBJECT("无效值", "NULL_OBJECT"),
    SENSITIVE_PERSONAL_DATA("敏感个人数据", "SENSITIVE_PERSONAL_DATA"),
    GENERAL_PERSONAL_DATA("一般个人数据", "GENERAL_PERSONAL_DATA"),
    NON_PERSONAL_DATA("非个人数据", "NON_PERSONAL_DATA"),
    CROSSBAR("-", "NON_PERSONAL_DATA");

    private final String key;
    private final String value;

    PrivacyLevel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static PrivacyLevel getByKey(String key) throws AppException {
        for (PrivacyLevel privacyLevel : values()) {
            if (StringUtils.equals(key, privacyLevel.key)) {
                return privacyLevel;
            }
        }
        throw new AppException("Illegal PrivacyLevel key: " + key);
    }
}