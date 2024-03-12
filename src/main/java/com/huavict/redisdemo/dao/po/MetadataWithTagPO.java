/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.huavict.redisdemo.dao.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * TODO
 *
 * @author l30055129
 * @since 2024-02-28 14:23
 */
@Data
@ToString
public class MetadataWithTagPO {
    private Long id;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private String updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    private String enterpriseId;
    private String projectId;
    private String source;
    private String sourceId;
    private String databaseName;
    private String tableName;
    private String columnName;
    private String securityLevel;
    private String privateLevel;
}
