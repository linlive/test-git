/* 
 * 日期：2020年5月4日
 *  
 * 版权所有：浙江浙大网新众合轨道交通工程有限公司
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/home")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
