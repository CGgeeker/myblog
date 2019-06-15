package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.ArticleAndLabelMapper;
import cn.cggeeker.pojo.ArticleAndLabel;
import cn.cggeeker.service.ArticleAndLabelService;
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
public class ArticleAndLabelServiceImpl implements ArticleAndLabelService {
    @Autowired
    ArticleAndLabelMapper articleAndLabelMapper;

    @Override
    public List<ArticleAndLabel> findArticleAndLabelById(int articleId) {
        return articleAndLabelMapper.findArticleAndLabelById(articleId);
    }
}
