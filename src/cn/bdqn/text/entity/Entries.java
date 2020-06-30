package cn.bdqn.text.entity;

import java.util.Date;

public class Entries {
    /*--文章的编号*/
    private  int id;



    /*--文章的标题*/
    private String title;
    /*--文章的内容*/
    private String content;
    /*--文章所属分类的编号,外键*/
    private int category_id;
    /*--文章所对应的评论数*/
    private int comment_hit;
    /*--文章是否允许评论*/
    private  int allow_comment;
    /*--状态值*/
    private int created_time;
    /*--文章添加的时间*/
    private Date status;
    /*--文章最后修改的时间*/
    private Date createdTime;
    /*--文章的点击数*/
    private int hits;
    private String imagePath;

    public Entries(int id, String title, String content, int category_id, int comment_hit, int allow_comment, int created_time, Date status, Date createdTime, int hits, String imagePath) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category_id = category_id;
        this.comment_hit = comment_hit;
        this.allow_comment = allow_comment;
        this.created_time = created_time;
        this.status = status;
        this.createdTime = createdTime;
        this.hits = hits;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public Entries() {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category_id = category_id;
        this.comment_hit = comment_hit;
        this.allow_comment = allow_comment;
        this.created_time = created_time;
        this.status = status;
        this.createdTime = createdTime;
        this.hits = hits;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getComment_hit() {
        return comment_hit;
    }

    public void setComment_hit(int comment_hit) {
        this.comment_hit = comment_hit;
    }

    public int getAllow_comment() {
        return allow_comment;
    }

    public void setAllow_comment(int allow_comment) {
        this.allow_comment = allow_comment;
    }

    public int getCreated_time() {
        return created_time;
    }

    public void setCreated_time(int created_time) {
        this.created_time = created_time;
    }

    public Date getStatus() {
        return status;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setStatus(Date status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
