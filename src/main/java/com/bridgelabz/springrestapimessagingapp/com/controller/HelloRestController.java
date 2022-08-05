/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */
package com.bridgelabz.springrestapimessagingapp.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {


    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello Form BridgeLabz";
    }

}