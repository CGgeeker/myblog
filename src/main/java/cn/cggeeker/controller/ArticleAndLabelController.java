package cn.cggeeker.controller;

import cn.cggeeker.pojo.ArticleAndLabel;
import cn.cggeeker.service.ArticleAndLabelService;
import cn.cggeeker.service.CommentService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/articleandlabel")
public class ArticleAndLabelController {  //文章，标签关系控制器
    @Autowired
    ArticleAndLabelService articleAndLabelService;

    @Autowired
    CommentService commentService;

    @RequestMapping("/findArticleAndLabelAndArticleCountById")//根据文章id查找文章标签关系表相关信息
    public ResultJson findArticleAndLabelById(int articleId){

        ResultJson resultJson = new ResultJson();

        Map<String,Object> map = new HashMap<>(); //创造一个map存储文章评论数和文章对应的标签信息

        int count = commentService.findCommentCountById(articleId);//根据文章id查找对应的评论数
        List<ArticleAndLabel> articleAndLabelList = articleAndLabelService.findArticleAndLabelById(articleId);
        if(!articleAndLabelList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("根据labelid查询文章标签关系表成功！");
            map.put("articleCount",count);
            map.put("articleAndLabelList",articleAndLabelList);
            resultJson.setData(map);
        }else
        {
            resultJson.setStatus(500);
            resultJson.setMessage("查询文章标签关系表为空！");
        }
        return resultJson;
    }

}
