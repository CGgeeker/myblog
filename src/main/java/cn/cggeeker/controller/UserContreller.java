package cn.cggeeker.controller;

import cn.cggeeker.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@RestController
@Slf4j
public class UserContreller {
    @Autowired
    private UserService userService;




}
