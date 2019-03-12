package com.swagger.demo.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebService;

/**
 * @author WenKai
 * @description
 * @create 2018-12-14 15:24
 */
@WebService(endpointInterface = "com.swagger.demo.server.MyWebService")
@Api("UserController 接口")
public class MyWebserviceImpl implements MyWebService{
    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET)
    public int add(int a, int b) {
        System.out.println(a+"+"+b+"="+(a+b));
        return a+b;
    }

    public int minus(int a, int b) {
        System.out.println(a+"-"+b+"="+(a-b));
        return a-b;
    }
}
