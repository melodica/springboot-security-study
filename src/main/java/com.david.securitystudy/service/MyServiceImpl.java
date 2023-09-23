package com.david.securitystudy.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{
    @Override
    public String pong() {
        return "pong";
    }

    @Override
    public String auth() {
        return "authorized";
    }

    @Override
    public String safeZone() {
        return "safe-zone";
    }

    @Override
    public String admin() {
        return "admin";
    }

    @Override
    public String user() {
        return "user";
    }
}
