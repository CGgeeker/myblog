package cn.cggeeker.mapper;

import cn.cggeeker.pojo.LeaveWord;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/20/020
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
@Repository
public interface LeaveWordMapper {

    public List<LeaveWord> findAllLeaveWord();  //查找所有的留言

    public int insertOneLeaveWord(LeaveWord leaveWord); //新增留言

    public int deleteOneLeaveWordById(int leavewordId);  //根据留言id删除对应的留言

}
