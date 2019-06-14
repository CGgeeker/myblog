package cn.cggeeker.controller;

import cn.cggeeker.pojo.Label;
import cn.cggeeker.service.LabelService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@Controller
@RequestMapping("/label")
public class LabelController {
    @Autowired
    LabelService labelService;

    @RequestMapping("/findAllLabel.do")
    @ResponseBody
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

}