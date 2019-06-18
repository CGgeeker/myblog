package cn.cggeeker.controller;

import cn.cggeeker.pojo.Article;
import cn.cggeeker.service.ArticleService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/article")
public class ArticleController {   //文章控制器
    @Autowired
    ArticleService articleService;

    @GetMapping("/findAllArticle")   //查询限定范围内的文章信息
    public ResultJson findAllArticle(int startIndex,int pageSize){
        ResultJson resultJson = new ResultJson();
        List<Article> articleList = articleService.findAllArticle(startIndex,pageSize);
        if(!articleList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("查询文章成功！");
            resultJson.setData(articleList);
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("文章信息为空！");
        }
        return resultJson;
    }

    @GetMapping("/findOneArticleById")
    public ResultJson findOneArticleById(int articleId){
        ResultJson resultJson = new ResultJson();
        Article article = articleService.findOneArticleById(articleId);
        if(article!=null){
            resultJson.setStatus(200);
            resultJson.setMessage("查询文章成功！");
            resultJson.setData(article);
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("文章信息为空！");
        }
        return resultJson;
    }

    @PostMapping("/updateTheArticleReadingNum")
    public ResultJson updateTheArticleReadingNum(int articleId, int newAddNum){
        ResultJson resultJson = new ResultJson();
        int affectRow = articleService.updateTheArticleReadingNum(articleId,newAddNum);
        if(affectRow>0){
            resultJson.setStatus(200);
            resultJson.setMessage("文章阅读量+1成功！");
        }else{
            resultJson.setStatus(200);
            resultJson.setMessage("文章阅读量+1失败！");
        }
        return resultJson;
    }

}
