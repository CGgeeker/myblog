package cn.cggeeker.mapper;

import cn.cggeeker.pojo.Article;
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
public interface ArticleMapper {

    public List<Article> findAllArticle(@Param("startIndex") int startIndex, @Param("pageSize")int pageSize);//根据指定范围查找所有

    public Article findOneArticleById(int articleId); //根据articleId查找文章信息

    //根据articleId增加文章的阅读（浏览）量 + 1
    public int updateTheArticleReadingNum(@Param("articleId")int articleId ,@Param("newAddNum")int newAddNum);

}
