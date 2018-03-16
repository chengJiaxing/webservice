package com.gs.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author xiaopeng
 * @date 2018/3/16 10:44
 */
@WebService
public class HelloServiceImpl implements HelloService {
    @WebMethod
    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @WebMethod
    @Override
    public String say(String name) {
        return "hello, " + name;
    }
}
