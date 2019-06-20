package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.LeaveWordMapper;
import cn.cggeeker.pojo.LeaveWord;
import cn.cggeeker.service.LeaveWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/20/020
 * @Description:cn.cggeeker.service.impl
 * @version:1.0
 */
@Service
public class LeaveWordServiceImpl implements LeaveWordService {
    @Autowired
    LeaveWordMapper leaveWordMapper;

    @Override
    public List<LeaveWord> findAllLeaveWord() {
        return leaveWordMapper.findAllLeaveWord();
    }

    @Override
    public int insertOneLeaveWord(LeaveWord leaveWord) {
        return leaveWordMapper.insertOneLeaveWord(leaveWord);
    }

    @Override
    public int deleteOneLeaveWordById(int leavewordId) {
        return leaveWordMapper.deleteOneLeaveWordById(leavewordId);
    }
}
