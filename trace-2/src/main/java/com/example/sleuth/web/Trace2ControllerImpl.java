package com.example.sleuth.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: Trace2ControllerImpl
 * Author:   SunEee
 * Date:     2018/5/14 9:47
 * Description: 实现类
 */
@RestController
public class Trace2ControllerImpl implements Trace2Controller{

    private final Logger logger = Logger.getLogger(getClass());

    @Override
    @GetMapping("trace2/{string}")
    public String TestString( @PathVariable("string") String string) {
        logger.info("------------trace2==========");
        string = "trace2 ->" + string;
        System.out.println(string);
        return string;
    }
}
