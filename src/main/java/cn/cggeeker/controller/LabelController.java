package cn.cggeeker.controller;

import cn.cggeeker.pojo.Label;
import cn.cggeeker.service.LabelService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/label")
public class LabelController {   //标签控制器
    @Autowired
    LabelService labelService;

    @GetMapping("/findAllLabel")   //查找标签表中所有标签信息
    public ResultJson findAllLabel(){

        ResultJson resultJson = new ResultJson();
        List<Label> labelList = labelService.findAllLabel();
        if(!labelList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("已查到所有标签！");
            resultJson.setData(labelList);
        }else {
            resultJson.setStatus(500);
            resultJson.setMessage("标签查询为空！");
        }
        return resultJson;
    }

    @PostMapping("/insertNewLabel")
    public ResultJson insertNewLabel(String newLabelName){
        ResultJson resultJson = new ResultJson();

        int resultRow = labelService.insertNewLabel(newLabelName);
        if(resultRow > 0){
            resultJson.setStatus(200);
            resultJson.setMessage("新增标签成功!");
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("新增标签失败或标签已存在!");
        }
        return resultJson;
    }

}
