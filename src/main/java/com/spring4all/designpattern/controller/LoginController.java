package com.spring4all.designpattern.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-05 13:47
 */
@RestController
@RequestMapping("/home")
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("login start");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itest.info");

        String title = driver.getTitle();
        System.out.printf(title);

        driver.close();
        System.out.println("login end");
        return "success";
    }
}