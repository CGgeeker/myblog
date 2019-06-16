package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.CommentMapper;
import cn.cggeeker.pojo.Comment;
import cn.cggeeker.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/16/016
 * @Description:cn.cggeeker.service.impl
 * @version:1.0
 */

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> findCommentById(int articleId) {
        return commentMapper.findCommentById(articleId);
    }

    @Override
    public int findCommentCountById(int articleId) {    //根据文章id查找评论总数
        List<Comment> commentList = commentMapper.findCommentById(articleId);
        if(!commentList.isEmpty()){
            int count = commentList.size();
            return count;
        }
        return 0;
    }
}
