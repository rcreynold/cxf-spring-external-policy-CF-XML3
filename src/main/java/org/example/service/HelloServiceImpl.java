package org.example.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.service.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
