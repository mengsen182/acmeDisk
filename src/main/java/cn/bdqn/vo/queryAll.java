package cn.bdqn.vo;

import cn.bdqn.entity.CommodityComment;

/**
 * Created by Administrator on 2018/3/23/023.
 */
public class queryAll {
    private CommodityComment commodityComment;
    private String userNick,userid;

    @Override
    public String toString() {
        return "queryAll{" +
                "commodityComment=" + commodityComment +
                ", userNick='" + userNick + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }

    public CommodityComment getCommodityComment() {
        return commodityComment;
    }

    public void setCommodityComment(CommodityComment commodityComment) {
        this.commodityComment = commodityComment;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
