package ru.netology;

public class Post {
    private int id;
    private int userId;
    private int dataCreate;
    private int textPost;
    private int subjectId;
    private int urlSource;
    private int likeSum;
    private int commentSum;
    private int shareSum;
    private int viewSum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(int dataCreate) {
        this.dataCreate = dataCreate;
    }

    public int getTextPost() {
        return textPost;
    }

    public void setTextPost(int textPost) {
        this.textPost = textPost;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getUrlSource() {
        return urlSource;
    }

    public void setUrlSource(int urlSource) {
        this.urlSource = urlSource;
    }

    public int getLikeSum() {
        return likeSum;
    }

    public void setLikeSum(int likeSum) {
        this.likeSum = likeSum;
    }

    public int getCommentSum() {
        return commentSum;
    }

    public void setCommentSum(int commentSum) {
        this.commentSum = commentSum;
    }

    public int getShareSum() {
        return shareSum;
    }

    public void setShareSum(int shareSum) {
        this.shareSum = shareSum;
    }

    public int getViewSum() {
        return viewSum;
    }

    public void setViewSum(int viewSum) {
        this.viewSum = viewSum;
    }
}


