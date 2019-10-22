package com.a2dict.a2dall.controller;

import com.a2dict.a2dall.domain.People;
import com.a2dict.a2dall.util.ClojureUtil;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
