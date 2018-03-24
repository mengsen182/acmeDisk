package cn.bdqn.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*回复表*/
public class Reply {
    /*
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
回复Id	replyId	int			TRUE	FALSE	TRUE
评论Id	discussId	int			FALSE	TRUE	FALSE
回复内容	replyConTent	varchar(50)	50		FALSE	FALSE	FALSE
更新时间	updateTime	date			FALSE	FALSE	FALSE
回复数	replyCount	int			FALSE	FALSE	FALSE
    *
    * */
    private int replyId ,discussId ,userid;
    private String replyConTent;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private CommodityComment commodityComment;

    public Reply() {
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", discussId=" + discussId +
                ", userid=" + userid +
                ", replyConTent='" + replyConTent + '\'' +
                ", updateTime=" + updateTime +
                ", commodityComment=" + commodityComment +
                '}';
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getDiscussId() {
        return discussId;
    }

    public void setDiscussId(int discussId) {
        this.discussId = discussId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getReplyConTent() {
        return replyConTent;
    }

    public void setReplyConTent(String replyConTent) {
        this.replyConTent = replyConTent;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public CommodityComment getCommodityComment() {
        return commodityComment;
    }

    public void setCommodityComment(CommodityComment commodityComment) {
        this.commodityComment = commodityComment;
    }
}
