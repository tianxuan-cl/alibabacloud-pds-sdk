// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * create_share_link response
 */
public class CreateShareLinkResponse extends TeaModel {
    // access_count
    @NameInMap("access_count")
    public Long accessCount;

    // Category
    @NameInMap("category")
    public String category;

    // comments
    @NameInMap("comments")
    public String comments;

    // 允许上传
    @NameInMap("creatable")
    public Boolean creatable;

    // 允许上传的目录列表
    @NameInMap("creatable_file_id_list")
    public java.util.List<String> creatableFileIdList;

    // created_at
    @NameInMap("created_at")
    public String createdAt;

    // creator
    @NameInMap("creator")
    public String creator;

    // description
    @NameInMap("description")
    public String description;

    // 禁止下载分享中的文件
    @NameInMap("disable_download")
    public Boolean disableDownload;

    // 禁止预览分享中的文件
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    // 禁止转存分享中的文件
    @NameInMap("disable_save")
    public Boolean disableSave;

    // 分享中的文件不可见
    @NameInMap("disable_visible")
    public Boolean disableVisible;

    // 下载次数
    @NameInMap("download_count")
    public Long downloadCount;

    // 分享下载次数限制
    @NameInMap("download_limit")
    public Long downloadLimit;

    // file_list
    @NameInMap("drive_file_list")
    public java.util.List<ShareFile> driveFileList;

    // drive_id
    @NameInMap("drive_id")
    public String driveId;

    // enable_file_changed_notify
    @NameInMap("enable_file_changed_notify")
    public Boolean enableFileChangedNotify;

    // expiration
    @NameInMap("expiration")
    public String expiration;

    // expired
    @NameInMap("expired")
    public Boolean expired;

    // file_id
    @NameInMap("file_id")
    public String fileId;

    // file_id_list
    @NameInMap("file_id_list")
    public java.util.List<String> fileIdList;

    // file_id_list
    @NameInMap("file_path_list")
    public java.util.List<String> filePathList;

    // is_subscribed
    @NameInMap("is_subscribed")
    public Boolean isSubscribed;

    // num_of_subscribers
    @NameInMap("num_of_subscribers")
    public Long numOfSubscribers;

    // 允许在线编辑文档
    @NameInMap("office_editable")
    public Boolean officeEditable;

    // preview_count
    @NameInMap("preview_count")
    public Long previewCount;

    // 分享预览次数限制
    @NameInMap("preview_limit")
    public Long previewLimit;

    // 举报次数
    @NameInMap("report_count")
    public Long reportCount;

    // 企业内(domain)登录后才允许使用分享
    @NameInMap("require_login")
    public Boolean requireLogin;

    // 转存次数
    @NameInMap("save_count")
    public Long saveCount;

    // 分享转存和下载的总次数限制
    @NameInMap("save_download_limit")
    public Long saveDownloadLimit;

    // 分享转存次数限制
    @NameInMap("save_limit")
    public Long saveLimit;

    // share_icon
    @NameInMap("share_icon")
    public String shareIcon;

    // share_id
    @NameInMap("share_id")
    public String shareId;

    // share_msg
    @NameInMap("share_msg")
    public String shareMsg;

    // share_name
    @NameInMap("share_name")
    public String shareName;

    // share_policy
    @NameInMap("share_policy")
    public String sharePolicy;

    // share_pwd
    @NameInMap("share_pwd")
    public String sharePwd;

    // share_url
    @NameInMap("share_url")
    public String shareUrl;

    // status
    @NameInMap("status")
    public String status;

    // updated_at
    @NameInMap("updated_at")
    public String updatedAt;

    // 音视频播放次数
    @NameInMap("video_preview_count")
    public Long videoPreviewCount;

    // ViewID
    @NameInMap("view_id")
    public String viewId;

    public static CreateShareLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShareLinkResponse self = new CreateShareLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateShareLinkResponse setAccessCount(Long accessCount) {
        this.accessCount = accessCount;
        return this;
    }
    public Long getAccessCount() {
        return this.accessCount;
    }

    public CreateShareLinkResponse setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateShareLinkResponse setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateShareLinkResponse setCreatable(Boolean creatable) {
        this.creatable = creatable;
        return this;
    }
    public Boolean getCreatable() {
        return this.creatable;
    }

    public CreateShareLinkResponse setCreatableFileIdList(java.util.List<String> creatableFileIdList) {
        this.creatableFileIdList = creatableFileIdList;
        return this;
    }
    public java.util.List<String> getCreatableFileIdList() {
        return this.creatableFileIdList;
    }

    public CreateShareLinkResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateShareLinkResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateShareLinkResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateShareLinkResponse setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public CreateShareLinkResponse setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public CreateShareLinkResponse setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public CreateShareLinkResponse setDisableVisible(Boolean disableVisible) {
        this.disableVisible = disableVisible;
        return this;
    }
    public Boolean getDisableVisible() {
        return this.disableVisible;
    }

    public CreateShareLinkResponse setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public CreateShareLinkResponse setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public CreateShareLinkResponse setDriveFileList(java.util.List<ShareFile> driveFileList) {
        this.driveFileList = driveFileList;
        return this;
    }
    public java.util.List<ShareFile> getDriveFileList() {
        return this.driveFileList;
    }

    public CreateShareLinkResponse setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateShareLinkResponse setEnableFileChangedNotify(Boolean enableFileChangedNotify) {
        this.enableFileChangedNotify = enableFileChangedNotify;
        return this;
    }
    public Boolean getEnableFileChangedNotify() {
        return this.enableFileChangedNotify;
    }

    public CreateShareLinkResponse setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public CreateShareLinkResponse setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public CreateShareLinkResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateShareLinkResponse setFileIdList(java.util.List<String> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }
    public java.util.List<String> getFileIdList() {
        return this.fileIdList;
    }

    public CreateShareLinkResponse setFilePathList(java.util.List<String> filePathList) {
        this.filePathList = filePathList;
        return this;
    }
    public java.util.List<String> getFilePathList() {
        return this.filePathList;
    }

    public CreateShareLinkResponse setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
        return this;
    }
    public Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public CreateShareLinkResponse setNumOfSubscribers(Long numOfSubscribers) {
        this.numOfSubscribers = numOfSubscribers;
        return this;
    }
    public Long getNumOfSubscribers() {
        return this.numOfSubscribers;
    }

    public CreateShareLinkResponse setOfficeEditable(Boolean officeEditable) {
        this.officeEditable = officeEditable;
        return this;
    }
    public Boolean getOfficeEditable() {
        return this.officeEditable;
    }

    public CreateShareLinkResponse setPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Long getPreviewCount() {
        return this.previewCount;
    }

    public CreateShareLinkResponse setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public CreateShareLinkResponse setReportCount(Long reportCount) {
        this.reportCount = reportCount;
        return this;
    }
    public Long getReportCount() {
        return this.reportCount;
    }

    public CreateShareLinkResponse setRequireLogin(Boolean requireLogin) {
        this.requireLogin = requireLogin;
        return this;
    }
    public Boolean getRequireLogin() {
        return this.requireLogin;
    }

    public CreateShareLinkResponse setSaveCount(Long saveCount) {
        this.saveCount = saveCount;
        return this;
    }
    public Long getSaveCount() {
        return this.saveCount;
    }

    public CreateShareLinkResponse setSaveDownloadLimit(Long saveDownloadLimit) {
        this.saveDownloadLimit = saveDownloadLimit;
        return this;
    }
    public Long getSaveDownloadLimit() {
        return this.saveDownloadLimit;
    }

    public CreateShareLinkResponse setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public CreateShareLinkResponse setShareIcon(String shareIcon) {
        this.shareIcon = shareIcon;
        return this;
    }
    public String getShareIcon() {
        return this.shareIcon;
    }

    public CreateShareLinkResponse setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public CreateShareLinkResponse setShareMsg(String shareMsg) {
        this.shareMsg = shareMsg;
        return this;
    }
    public String getShareMsg() {
        return this.shareMsg;
    }

    public CreateShareLinkResponse setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public CreateShareLinkResponse setSharePolicy(String sharePolicy) {
        this.sharePolicy = sharePolicy;
        return this;
    }
    public String getSharePolicy() {
        return this.sharePolicy;
    }

    public CreateShareLinkResponse setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

    public CreateShareLinkResponse setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }
    public String getShareUrl() {
        return this.shareUrl;
    }

    public CreateShareLinkResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateShareLinkResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateShareLinkResponse setVideoPreviewCount(Long videoPreviewCount) {
        this.videoPreviewCount = videoPreviewCount;
        return this;
    }
    public Long getVideoPreviewCount() {
        return this.videoPreviewCount;
    }

    public CreateShareLinkResponse setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
