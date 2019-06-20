package cn.cggeeker.controller;

import cn.cggeeker.pojo.LeaveWord;
import cn.cggeeker.service.LeaveWordService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/20/020
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/leaveword")
public class LeaveWordController {
    @Autowired
    LeaveWordService leaveWordService;

    @GetMapping("/findAllLeaveWord")
    public ResultJson findAllLeaveWord(){
        ResultJson resultJson = new ResultJson();
        List<LeaveWord> leavewordList = leaveWordService.findAllLeaveWord();
        if(!leavewordList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("已查询到所有留言!");
            resultJson.setData(leavewordList);
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("没有留言!");
        }
        return resultJson;
    }

    @PostMapping("/insertOneLeaveWord")
    public ResultJson insertOneLeaveWord(LeaveWord leaveWord){
        ResultJson resultJson = new ResultJson();
        int resultRow = leaveWordService.insertOneLeaveWord(leaveWord);
        if(resultRow > 0){
            resultJson.setStatus(200);
            resultJson.setMessage("留言新增成功!");
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("留言新增失败!");
        }
        return resultJson;
    }

    @PostMapping("/deleteOneLeaveWordById")
    public ResultJson deleteOneLeaveWordById(int leavewordId){
        ResultJson resultJson = new ResultJson();
        int resultRow = leaveWordService.deleteOneLeaveWordById(leavewordId);
        if(resultRow > 0){
            resultJson.setStatus(200);
            resultJson.setMessage("留言删除成功!");
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("留言删除失败!");
        }
        return resultJson;
    }

}
