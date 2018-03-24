package cn.bdqn.controller.ReplyAndCommentController;

import cn.bdqn.entity.CommodityComment;
import cn.bdqn.service.ReplyAndComment.ReplyAndCommentService;
import cn.bdqn.util.Message;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21/021.
 */
@Controller
@RequestMapping("toReply")
public class ReplyAndCommentController {
    @Resource
    private ReplyAndCommentService replyAndCommentService;

    @RequestMapping("queryAll")
    public String queryAll( Model model) {
        List<CommodityComment> list = replyAndCommentService.queryAll();
        List<CommodityComment> GoodList = replyAndCommentService.queryGood();
        List<CommodityComment> ZhongList = replyAndCommentService.queryZhong();
        List<CommodityComment> ChaList = replyAndCommentService.queryCha();
        Integer queryAllCount = replyAndCommentService.queryAllCount();
        Integer queryChaCount = replyAndCommentService.queryChaCount();
        Integer queryZhongCount =replyAndCommentService.queryZhongCount();
        Integer queryGoodCount = replyAndCommentService.queryGoodCount();
        Integer GoodB=(int)(((double)queryGoodCount)/(double)queryAllCount*100);
        Integer ZhongB = (int) (((double) queryZhongCount / (double) queryAllCount) * 100);
        Integer ChaB = (int) (((double) queryChaCount / (double) queryAllCount) * 100);
        System.out.println(GoodB);
        List<CommodityComment> queryFive =replyAndCommentService.queryFive();
        model.addAttribute("queryFive", queryFive);
        model.addAttribute("ZhongB", ZhongB);
        model.addAttribute("ChaB", ChaB);
        model.addAttribute("GoodB", GoodB);
        model.addAttribute("pageInfo", list);
        model.addAttribute("listGood", GoodList);
        model.addAttribute("listZhong", ZhongList);
        model.addAttribute("listCha", ChaList);
        model.addAttribute("queryAllCount", queryAllCount);
        model.addAttribute("queryChaCount", queryChaCount);
        model.addAttribute("queryZhongCount", queryZhongCount);
        model.addAttribute("queryGoodCount", queryGoodCount);
        return "detail";
    }

    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public String add(CommodityComment commodityComment) {
        int n = replyAndCommentService.add(commodityComment);
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());

    }

}
