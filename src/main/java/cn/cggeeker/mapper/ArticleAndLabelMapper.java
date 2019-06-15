package cn.cggeeker.mapper;

import cn.cggeeker.pojo.ArticleAndLabel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
@Repository
public interface ArticleAndLabelMapper {
    public List<ArticleAndLabel> findArticleAndLabelById(Integer articleId);
}
