// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hosting.mode.models;

import com.aliyun.tea.*;

/**
 * create_share_link request
 */
public class CreateShareLinkRequest extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // drive_id
    @NameInMap("drive_id")
    @Validation(required = true, pattern = "[0-9]+")
    public String driveId;

    // expiration
    @NameInMap("expiration")
    @Validation(required = true)
    public String expiration;

    // file_id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // file_id_list
    @NameInMap("file_id_list")
    @Validation(required = true, maximum = 50, minimum = 1)
    public java.util.List<String> fileIdList;

    // file_path_list
    @NameInMap("file_path_list")
    @Validation(required = true, maximum = 50, minimum = 1)
    public java.util.List<String> filePathList;

    // share_name
    @NameInMap("share_name")
    public String shareName;

    // share_pwd
    @NameInMap("share_pwd")
    public String sharePwd;

    public static CreateShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShareLinkRequest self = new CreateShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateShareLinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateShareLinkRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateShareLinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public CreateShareLinkRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateShareLinkRequest setFileIdList(java.util.List<String> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }
    public java.util.List<String> getFileIdList() {
        return this.fileIdList;
    }

    public CreateShareLinkRequest setFilePathList(java.util.List<String> filePathList) {
        this.filePathList = filePathList;
        return this;
    }
    public java.util.List<String> getFilePathList() {
        return this.filePathList;
    }

    public CreateShareLinkRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public CreateShareLinkRequest setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

}
