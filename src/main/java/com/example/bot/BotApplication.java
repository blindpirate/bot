package com.example.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 1. 当有人来提交一个PR/MR的时候，自动打上一个标签：waiting-for-review
 * 2. 如果有人review过代码，他可以在评论中打一个/lgtm
 *    此时，若该PR通过了CI，则机器人执行自动的合并
 */
@SpringBootApplication
@RestController
public class BotApplication {
    public static void main(String[] args) {
        SpringApplication.run(BotApplication.class, args);
    }

    @PostMapping("/bot")
    public String endpoint(@RequestBody String body, HttpServletRequest request) {
        System.out.println(request.getHeader("X-GitHub-Event"));
        System.out.println(body);
        return "OK";
    }
}
