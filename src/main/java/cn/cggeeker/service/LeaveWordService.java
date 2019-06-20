package cn.cggeeker.service;

import cn.cggeeker.pojo.LeaveWord;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/20/020
 * @Description:cn.cggeeker.service
 * @version:1.0
 */
public interface LeaveWordService {


    public List<LeaveWord> findAllLeaveWord();  //查找所有的留言

    public int insertOneLeaveWord(LeaveWord leaveWord); //新增留言

    public int deleteOneLeaveWordById(int leavewordId);  //根据留言id删除对应的留言

}
