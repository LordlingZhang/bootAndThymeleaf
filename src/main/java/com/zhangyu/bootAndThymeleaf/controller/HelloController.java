/**
 * @Description TODO
 * @author ZhangYu
 * @date 下午10:01:41
 */
package com.zhangyu.bootAndThymeleaf.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhangYu
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloController {

	@ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("hello", "hello Thymeleaf!");
        return "hello";
    }
	
	
}
