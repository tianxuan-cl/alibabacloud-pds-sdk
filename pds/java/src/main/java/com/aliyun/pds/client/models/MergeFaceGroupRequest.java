// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * # Merge face group request
 */
public class MergeFaceGroupRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    /**
     * <p>drive_id</p>
     */
    @NameInMap("drive_id")
    @Validation(required = true, pattern = "[0-9]+")
    public String driveId;

    /**
     * <p>from_group_id</p>
     */
    @NameInMap("from_group_id")
    public String fromGroupId;

    /**
     * <p>from_group_ids</p>
     */
    @NameInMap("from_group_ids")
    @Validation(required = true)
    public java.util.List<String> fromGroupIds;

    /**
     * <p>to_group_id</p>
     */
    @NameInMap("to_group_id")
    @Validation(required = true)
    public String toGroupId;

    public static MergeFaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeFaceGroupRequest self = new MergeFaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MergeFaceGroupRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public MergeFaceGroupRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public MergeFaceGroupRequest setFromGroupId(String fromGroupId) {
        this.fromGroupId = fromGroupId;
        return this;
    }
    public String getFromGroupId() {
        return this.fromGroupId;
    }

    public MergeFaceGroupRequest setFromGroupIds(java.util.List<String> fromGroupIds) {
        this.fromGroupIds = fromGroupIds;
        return this;
    }
    public java.util.List<String> getFromGroupIds() {
        return this.fromGroupIds;
    }

    public MergeFaceGroupRequest setToGroupId(String toGroupId) {
        this.toGroupId = toGroupId;
        return this;
    }
    public String getToGroupId() {
        return this.toGroupId;
    }

}
