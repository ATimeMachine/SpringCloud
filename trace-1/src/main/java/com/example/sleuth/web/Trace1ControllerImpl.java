package com.example.sleuth.web;

import com.example.sleuth.feign.Trace2Feign;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: Trace1ControllerImpl
 * Author:   SunEee
 * Date:     2018/5/14 9:53
 * Description: 实现类
 */
@RestController
public class Trace1ControllerImpl implements Trace1Controller {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    Trace2Feign trace2Feign;

    @Override
    @GetMapping("trace1/{string}")
    public String testString(@PathVariable("string") String string) {
        logger.info("--------trace1---------");
        string = "trace1 -> " + trace2Feign.testString(string);
        System.out.println(string);
        return string;
    }
}
