package ru.netology.domain;

import javax.xml.crypto.Data;
import java.util.Date;

public class Post {
    private int postID;
    private int UserID;
    private int ownerID;
    private int createdBy;
    private Data dataCreate;
    private String textPost;
    private int replyOwnerID;
    private int replyPostID;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private LikesInfo likesService;
    private ViewsInfo viesService;
    private GeoInfo geoInfo;
    private int signedID;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavourite;
    private int postponedID;
    private String imageURL;
    private String postType;

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Data getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(Data dataCreate) {
        this.dataCreate = dataCreate;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesService() {
        return likesService;
    }

    public void setLikesService(LikesInfo likesService) {
        this.likesService = likesService;
    }

    public ViewsInfo getViesService() {
        return viesService;
    }

    public void setViesService(ViewsInfo viesService) {
        this.viesService = viesService;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSignedID() {
        return signedID;
    }

    public void setSignedID(int signedID) {
        this.signedID = signedID;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public int getPostponedID() {
        return postponedID;
    }

    public void setPostponedID(int postponedID) {
        this.postponedID = postponedID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}

