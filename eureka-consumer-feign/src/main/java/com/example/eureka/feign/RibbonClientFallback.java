package com.example.eureka.feign;

import org.springframework.stereotype.Component;

/**
 * FileName: RibbonClientFallback
 * Author:   SunEee
 * Date:     2018/5/4 18:07
 * Description: 调用ribbon接口错误，降级调用
 */
@Component
public class RibbonClientFallback implements RibbonClient {
    @Override
    public String consumer() {
        return print("consumer");
    }

    @Override
    public String circle() {
        return print("circle");
    }

    @Override
    public String testBalanced(String param) {
        return print("testBalanced");
    }

    private String print(String methodName){
        System.out.println("调用服务的" + methodName + "方法失败，进行了熔断处理");
        return methodName;
    }
}
