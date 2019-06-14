package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.SiteTipMapper;
import cn.cggeeker.pojo.SiteTip;
import cn.cggeeker.service.SiteTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.service.impl
 * @version:1.0
 */
@Service
public class SiteTipServiceImpl implements SiteTipService {
    @Autowired
    SiteTipMapper siteTipMapper;

    @Override
    public List<SiteTip> findAllSiteTip() {
        return siteTipMapper.findAllSiteTip();
    }
}
