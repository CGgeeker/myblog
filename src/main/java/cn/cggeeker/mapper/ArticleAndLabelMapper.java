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
    public List<ArticleAndLabel> findArticleAndLabelById(int articleId);  //根据文章id查找文章标签表中信息

    //将标签名和根据文章标题查询的文章id 一并插入 文章标签表
    public int insertOneArticleAndLabel(@Param("labelName") String labelName,@Param("title") String title);
}
