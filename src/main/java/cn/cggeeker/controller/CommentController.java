package cn.cggeeker.controller;

import cn.cggeeker.pojo.Comment;
import cn.cggeeker.service.CommentService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/16/016
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {  //评论控制器
    @Autowired
    CommentService commentService;

    @GetMapping("/findCommentCountById")
    public ResultJson findCommentCountById(int articleId){
        ResultJson resultJson = new ResultJson();
        int count = commentService.findCommentCountById(articleId);
        resultJson.setStatus(200);
        resultJson.setMessage("查询该文章的评论数成功！");
        resultJson.setData(count);
        return  resultJson;
    }


    @GetMapping("/findCommentById")
    public ResultJson findCommentById(int articleId){
        ResultJson resultJson = new ResultJson();
        List<Comment> commentList = commentService.findCommentById(articleId);
        if(!commentList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("查询该文章的评论信息成功！");
            resultJson.setData(commentList);
        }
        else{
            resultJson.setStatus(500);
            resultJson.setMessage("查询该文章评论信息为空！");
        }
        return  resultJson;
    }




}
