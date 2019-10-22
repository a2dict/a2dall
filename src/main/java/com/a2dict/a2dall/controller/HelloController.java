package com.a2dict.a2dall.controller;

import com.a2dict.a2dall.HelloKT;
import com.a2dict.a2dall.Man;
import com.a2dict.a2dall.domain.People;
import com.a2dict.a2dall.util.ClojureUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a2dict on 2019/10/22
 */
@RestController
public class HelloController {

    @RequestMapping("/new_people")
    public People newPeople() {
        People p = ClojureUtil.loadAndCallFn("a2dall.core", "new-people");
        return p;
    }

    @RequestMapping("/hello_kt")
    public Man helloKt() {
        return new Man("helloKt");
    }

    @RequestMapping("/echo_kt")
    public String echo(@RequestParam String msg) {
        return HelloKT.echo(msg);
    }
}
