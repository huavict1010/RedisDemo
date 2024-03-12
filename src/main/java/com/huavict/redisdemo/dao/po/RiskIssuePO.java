package com.huavict.redisdemo.dao.po;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@ToString
public class RiskIssuePO {
    private Long id;
    private String enterpriseId;
    @NotBlank(message = "objectCode")
    private Integer objectType;
    @NotBlank(message = "riskType")
    private String riskType;
    @NotBlank(message = "complianceItem")
    private String complianceItem;
    @NotBlank(message = "complianceType")
    private String complianceType;
    @NotBlank(message = "title")
    private String title;
    @NotBlank(message = "status")
    private String status;
    private String objectCode;
    private String issueNo;
    private String guidance;
    private String detail;
    private String owner;
    private String statusDisposal;
    private String statusVerification;
    private String statusFinish;
    private String remark;
    private String deleteFlag;
    private String createdBy;
    private Date creationDate;
    private String lastUpdatedBy;
    private Date lastUpdateDate;
    private Data expirationTime;
    private Date latestConfirmationTime;
    private Date latestClosedTime;

}
