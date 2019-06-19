package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.LabelMapper;
import cn.cggeeker.mapper.UserMapper;
import cn.cggeeker.pojo.Label;
import cn.cggeeker.service.LabelService;
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
public class LabelServiceImpl implements LabelService {
    @Autowired
    LabelMapper labelMapper;


    @Override
    public List<Label> findAllLabel() {
        return labelMapper.findAllLabel();
    }

    @Override
    public int insertNewLabel(String newLabelName) {
        return labelMapper.insertNewLabel(newLabelName);
    }
}
