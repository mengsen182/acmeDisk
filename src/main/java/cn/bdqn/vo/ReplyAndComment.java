package cn.bdqn.vo;

import cn.bdqn.entity.CommodityComment;
import cn.bdqn.entity.Reply;
import cn.bdqn.entity.TUser;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21/021.
 */
public class ReplyAndComment {
    private List<CommodityComment> commodityComment;
    private List<TUser> tUser;
    private List<Reply> reply;

    @Override
    public String toString() {
        return "ReplyAndComment{" +
                "commodityComment=" + commodityComment +
                ", tUser=" + tUser +
                ", reply=" + reply +
                '}';
    }

    public List<CommodityComment> getCommodityComment() {
        return commodityComment;
    }

    public void setCommodityComment(List<CommodityComment> commodityComment) {
        this.commodityComment = commodityComment;
    }

    public List<TUser> gettUser() {
        return tUser;
    }

    public void settUser(List<TUser> tUser) {
        this.tUser = tUser;
    }

    public List<Reply> getReply() {
        return reply;
    }

    public void setReply(List<Reply> reply) {
        this.reply = reply;
    }
}
