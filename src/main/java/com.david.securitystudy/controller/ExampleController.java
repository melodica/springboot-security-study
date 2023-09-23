package com.david.securitystudy.controller;

import com.david.securitystudy.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private MyService myService;
    /*
     *  This is public access. require no authentication
     */
    @GetMapping("/api/ping")
    public String ping(){
        return myService.pong();
    }

    /*
     *  This is public access. require authentication
     */
    @GetMapping("/api/auth")
    public String authenticatedAccess(){
        return myService.auth();
    }

    /*
     *  This is private access. require caller from certain safe-zone
     */
    @GetMapping("/private/api/safeZone")
    public String privateSafeZoneAccess(){
        return myService.safeZone();
    }

    /*
     *  This is private access. require admin access
     */
    @GetMapping("/private/api/admin")
    public String privateAdminAccess(){
        return myService.admin();
    }

    /*
     *  This is private access. require user
     */
    @GetMapping("/private/api/user")
    public String privateUserAccess(){
        return myService.user();
    }

}
