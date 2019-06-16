package cn.cggeeker.controller;


import cn.cggeeker.pojo.Hero;
import cn.cggeeker.service.HeroService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:CG
 * @Date:2019/6/9/009
 * @Description:cn.cggeeker
 * @version:1.0
 */
/*@RestController*/
@Controller
@Slf4j
@RequestMapping("/hero")
public class HeroController {   // 测试用的控制器
    @Autowired
    private HeroService heroService;

    @GetMapping("/test")
    @ResponseBody
    public  Map<String,Object> hello(Model model){
        /*System.out.println("hello info");*/
        log.info("hello info log-info-----------");
        log.debug("hello info log-debug::::::::::");

        Map<String,Object> map = new HashMap<>();
        List<Hero> allHeroList = null;
        allHeroList =  heroService.getAllHero();
        map.put("status","200");
        map.put("msg","成功！");
        map.put("data",allHeroList);

        System.out.println(allHeroList);
        model.addAttribute("heroList",map);

        return map;
    }

    @RequestMapping("/myhello")
    public String myHello(Model model){
        model.addAttribute("name","极客星辰");
        List<Hero> allHeroList = null;
        allHeroList =  heroService.getAllHero();

        Hero hero = new Hero();
        hero.setId(1);
        hero.setUsername("CGgeeker");
        hero.setPhone("110");

        model.addAttribute("hero",hero);
        model.addAttribute("heroList",allHeroList);

        return "static/login";
    }
}
