package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.ArticleMapper;
import cn.cggeeker.pojo.Article;
import cn.cggeeker.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.service.impl
 * @version:1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> findAllArticle(int startIndex, int pageSize) {
        return articleMapper.findAllArticle(startIndex,pageSize);
    }

    @Override
    public Article findOneArticleById(int articleId) {
        return articleMapper.findOneArticleById(articleId);
    }

    @Override
    public int updateTheArticleReadingNum(int articleId, int newAddNum) {
        return articleMapper.updateTheArticleReadingNum(articleId,newAddNum);
    }
}
