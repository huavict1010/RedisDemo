/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.huavict.redisdemo.service;

import com.huavict.redisdemo.dao.MetadataWithTagDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author l30055129
 * @since 2024-03-12 10:40
 */

@Component
@Slf4j
public class TestCacheService {
    @Autowired
    private MetadataWithTagDAO metadataWithTagDAO;

    public void doProcess() {
        var POS = metadataWithTagDAO.findByAppIdAndTag("com.huawei.sd.isdp.sdimp", "TOP_SECRET", "SENSITIVE_PERSONAL_DATA");
        System.out.println();
    }
}
