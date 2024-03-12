package com.huavict.redisdemo.dao.po;/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * The Entity of AssetIssueRelation
 *
 * @author z30021515
 * @since 2023-11-03 09:58:30
 */
@Data
public class AssetIssueRelPO {

    /**
     * 主键
     **/
    private Long id;

    /**
     * 企业ID
     **/
    private String enterpriseId;

    /**
     * 应用ID
     **/
    private String projectId;


    /**
     * 模块ID
     **/
    private String moduleCode;


    /**
     * 资产ID
     **/
    private String assetId;

    /**
     * 检查项
     **/
    private String checkItem;

    /**
     * 问题单编号
     **/
    private String issueNo;

    /**
     * 默认为N, Y为软删除
     **/
    private String deleteFlag;

    /**
     * 创建人
     **/
    private String createdBy;

    /**
     * 创建时间
     **/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationDate;

    /**
     * 更新人
     **/
    private String lastUpdatedBy;

    /**
     * 更新时间
     **/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    private List<String> assetIds;

}
