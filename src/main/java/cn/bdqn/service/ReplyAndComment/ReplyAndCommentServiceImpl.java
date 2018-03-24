package cn.bdqn.service.ReplyAndComment;

import cn.bdqn.dao.ReplyAndComment.ReplyAndCommentMapper;
import cn.bdqn.entity.CommodityComment;
import cn.bdqn.vo.ReplyAndComment;
import cn.bdqn.vo.queryAll;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21/021.
 */
@Service
public class ReplyAndCommentServiceImpl implements ReplyAndCommentService {
    @Resource
    private ReplyAndCommentMapper replyAndCommentMapper;

    @Override
    public int add(CommodityComment commodityComment) {
        return replyAndCommentMapper.add(commodityComment);
    }



    @Override
    public int updateDeleteNews( int discussId) {
        return replyAndCommentMapper.updateDeleteNews( discussId);
    }

    @Override
    public List<CommodityComment> queryAll() {

        List<CommodityComment>list =replyAndCommentMapper.queryAll();


        return list;
    }

    @Override
    public List<CommodityComment> queryGood() {
        return replyAndCommentMapper.queryGood();
    }

    @Override
    public List<CommodityComment> queryZhong() {
        return replyAndCommentMapper.queryZhong();
    }

    @Override
    public List<CommodityComment> queryCha() {
        return replyAndCommentMapper.queryCha();
    }

    @Override
    public Integer queryGoodCount() {
        return replyAndCommentMapper.queryGoodCount();
    }

    @Override
    public Integer queryZhongCount() {
        return replyAndCommentMapper.queryZhongCount();
    }

    @Override
    public Integer queryChaCount() {
        return replyAndCommentMapper.queryChaCount();
    }

    @Override
    public Integer queryAllCount() {
        return replyAndCommentMapper.queryAllCount();
    }

    @Override
    public List<CommodityComment> queryFive() {
        return replyAndCommentMapper.queryFive();
    }
}
