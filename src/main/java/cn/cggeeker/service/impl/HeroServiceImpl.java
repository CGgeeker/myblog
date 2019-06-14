package cn.cggeeker.service.impl;


import cn.cggeeker.mapper.HeroMapper;
import cn.cggeeker.pojo.Hero;
import cn.cggeeker.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/9/009
 * @Description:cn.cggeeker
 * @version:1.0
 */
@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroMapper heroMapper;

    @Override
    public List<Hero> getAllHero() {
        System.out.println(":::!!!!!!!!!!!!!!!!service::!!!!!!!!!!!!!!!!!!!:"+heroMapper.selectAll());
        return heroMapper.getAllHero();
    }
}
