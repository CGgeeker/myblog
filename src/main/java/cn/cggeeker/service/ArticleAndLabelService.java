package cn.cggeeker.service;

import cn.cggeeker.pojo.ArticleAndLabel;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/15/015
 * @Description:cn.cggeeker.service
 * @version:1.0
 */
public interface ArticleAndLabelService {
    public List<ArticleAndLabel> findArticleAndLabelById(Integer articleId);

}
