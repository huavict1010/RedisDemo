/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.huavict.redisdemo.dao;

import com.huavict.redisdemo.dao.po.AssetIssueRelPO;
import com.huavict.redisdemo.dao.po.MetadataWithTagPO;
import com.huavict.redisdemo.dao.po.RiskIssuePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * TODO
 *
 * @author l30055129
 * @since 2024-03-04 14:00
 */

@Mapper
public interface MetadataWithTagDAO {
    List<MetadataWithTagPO> findByAppIdAndTag(@Param("appId") String appId, @Param("securityLevel") String securityLevel, @Param("privateLevel") String privateLevel );

    List<MetadataWithTagPO> findByAppIdAndIssueNo(@Param("appId") String appId);

    List<RiskIssuePO> findByAppIdAndField(@Param("projectId") String projectId, @Param("databaseName") String databaseName, @Param("tableName") String tableName, @Param("columnName") String columnName);

    int updateIssueList(@Param("list") List<RiskIssuePO> list);

    int updateIssueRelation(@Param("issueNo") String issueNo);

    int updateIssue(@Param("issueNo") String issueNo);

    Integer saveRiskIssue(@Param("item") RiskIssuePO riskIssuePO);

    Integer createAssetIssueRelation(@Param("item") AssetIssueRelPO assetIssueRelPO);

    Integer deleteIssueById(@Param("id") Long id);
}
