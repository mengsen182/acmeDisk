package cn.bdqn.service.ReplyAndComment;

import cn.bdqn.entity.CommodityComment;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20/020.
 */
public interface ReplyAndCommentService {
    //添加评论
    public int add(CommodityComment commodityComment);
    //修改
     /*public int updateNews(ReplyAndComment ReplyAndComment);*/
    //通过修改selectid字段实现假删除;
    public int updateDeleteNews(int discussId);

    //查看全部评论
    public List<CommodityComment> queryAll();
    //查看好评stitue 为1的字段
    public List<CommodityComment> queryGood();
    //查看中评selectid 为2的字段
    public List<CommodityComment> queryZhong();

    //查看差评selectid 为3的字段
    public List<CommodityComment> queryCha();
    //查看好评selectid 为1 的数量
    public Integer queryGoodCount();

    //查看中评selectid 为2的数量
    public Integer queryZhongCount();

    //查看差评selectid 为3的数量
    public Integer queryChaCount();

    //查看全部评论的数量
    public Integer queryAllCount();
    //查询前五位评论的用户
    public List<CommodityComment> queryFive();


}
