package cn.cggeeker.service;

import cn.cggeeker.pojo.Article;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.service
 * @version:1.0
 */
public interface ArticleService {

    public List<Article> findAllArticle(int startIndex, int pageSize);

    public Article findOneArticleById(int articleId);

    public int updateTheArticleReadingNum(int articleId ,int newAddNum);

    public int insertOneArticle(Article article);
}
