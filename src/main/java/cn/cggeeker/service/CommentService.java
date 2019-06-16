package cn.cggeeker.service;

import cn.cggeeker.pojo.Comment;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/16/016
 * @Description:cn.cggeeker.service
 * @version:1.0
 */
public interface CommentService {

    public List<Comment> findCommentById(int articleId);

    public int findCommentCountById(int articleId);
}
