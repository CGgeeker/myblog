package cn.cggeeker.controller;

import cn.cggeeker.pojo.SiteTip;
import cn.cggeeker.service.SiteTipService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/sitetip")
public class SiteTipController {  //公告控制器
    @Autowired
    SiteTipService siteTipService;

    @GetMapping("/findAllSiteTip") //查找公告表中所有的公告信息
    public ResultJson findAllSiteTip(){
        ResultJson resultJson = new ResultJson();
        List<SiteTip> sitetipList = siteTipService.findAllSiteTip();
        if(!sitetipList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("已查到站点公告！");
            resultJson.setData(sitetipList);
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("站点公告为空！");
        }
        return resultJson;
    }

}
