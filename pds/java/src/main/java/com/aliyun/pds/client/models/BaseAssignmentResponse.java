// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * List identity role response item
 */
public class BaseAssignmentResponse extends TeaModel {
    /**
     * <p>创建时间</p>
     */
    @NameInMap("created_at")
    @Validation(required = true)
    public Long createdAt;

    /**
     * <p>创建者的UserID</p>
     */
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    /**
     * <p>domain_id</p>
     */
    @NameInMap("domain_id")
    @Validation(required = true)
    public String domainId;

    @NameInMap("identity")
    @Validation(required = true)
    public Identity identity;

    /**
     * <p>管辖的资源ID</p>
     */
    @NameInMap("manage_resource_id")
    @Validation(required = true)
    public String manageResourceId;

    /**
     * <p>管辖的资源类型</p>
     */
    @NameInMap("manage_resource_type")
    @Validation(required = true)
    public String manageResourceType;

    /**
     * <p>授予的角色</p>
     */
    @NameInMap("role_id")
    @Validation(required = true)
    public String roleId;

    /**
     * <p>修改时间</p>
     */
    @NameInMap("updated_at")
    @Validation(required = true)
    public Long updatedAt;

    public static BaseAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseAssignmentResponse self = new BaseAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public BaseAssignmentResponse setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public BaseAssignmentResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseAssignmentResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseAssignmentResponse setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public BaseAssignmentResponse setManageResourceId(String manageResourceId) {
        this.manageResourceId = manageResourceId;
        return this;
    }
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    public BaseAssignmentResponse setManageResourceType(String manageResourceType) {
        this.manageResourceType = manageResourceType;
        return this;
    }
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    public BaseAssignmentResponse setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public BaseAssignmentResponse setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
