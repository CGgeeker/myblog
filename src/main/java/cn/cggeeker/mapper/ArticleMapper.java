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

    public List<Article> findAllArticle(@Param("startIndex") int startIndex, @Param("endIndex")int endIndex);//根据指定范围查找所有
}
