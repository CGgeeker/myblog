package cn.cggeeker.mapper;

import cn.cggeeker.pojo.Hero;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/9/009
 * @Description:cn.cggeeker
 * @version:1.0
 */
/*继承通用Mapper，实现对数据表的基本CRUD*/
@Repository
public interface HeroMapper extends Mapper<Hero> {

    public List<Hero> getAllHero();
}
