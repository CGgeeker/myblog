package cn.cggeeker.controller;

import cn.cggeeker.pojo.ArticleAndLabel;
import cn.cggeeker.service.ArticleAndLabelService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/articleandlabel")
public class ArticleAndLabelController {
    @Autowired
    ArticleAndLabelService articleAndLabelService;

    @RequestMapping("/findArticleAndLabelById")
    public ResultJson findArticleAndLabelById(int articleId){

        System.out.println("??????????????????????????-----: labelId:"+articleId);

        ResultJson resultJson = new ResultJson();
        List<ArticleAndLabel> articleAndLabelList = articleAndLabelService.findArticleAndLabelById(articleId);
        if(!articleAndLabelList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("根据labelid查询文章标签关系表成功！");
            resultJson.setData(articleAndLabelList);
        }else
        {
            resultJson.setStatus(500);
            resultJson.setMessage("查询文章标签关系表为空！");
        }
        return resultJson;
    }

}
