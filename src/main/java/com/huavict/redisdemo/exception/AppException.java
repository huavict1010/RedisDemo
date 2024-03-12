/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2021. All rights reserved.
 */

package com.huavict.redisdemo.exception;

public class AppException extends Exception {
    private static final long serialVersionUID = 5251809740262708068L;

    public AppException(Throwable cause) {
        super(cause);
    }

    public AppException(String message) {
        super(message);
    }
}