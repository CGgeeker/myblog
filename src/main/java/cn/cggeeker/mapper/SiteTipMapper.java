package cn.cggeeker.mapper;

import cn.cggeeker.pojo.SiteTip;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
@Repository
public interface SiteTipMapper {

    public List<SiteTip> findAllSiteTip(); //查找所有的站点公告
}
