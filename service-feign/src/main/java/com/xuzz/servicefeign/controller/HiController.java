package com.xuzz.servicefeign.controller;

import com.xuzz.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name)
    {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
