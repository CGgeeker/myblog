package cn.cggeeker.mapper;

import cn.cggeeker.pojo.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/16/016
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
@Repository
public interface CommentMapper {

    public List<Comment> findCommentById(int articleId);  //按照文章id查找评论信息
}
