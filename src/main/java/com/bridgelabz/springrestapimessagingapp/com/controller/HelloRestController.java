/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */
package com.bridgelabz.springrestapimessagingapp.com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    /**
     * purpose : Worn the request mapping is done then all the statements  of sayHello gets executed
     */
    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello Form BridgeLabz";
    }

    /**
     * @RequestParam : Mapping HTTP GET Request onto specific Handler Methods.
     *                 When mapping is done all statements of  sayHello method get executed
     */
    @GetMapping(value="/getMessage")
    public String sayHello(@RequestParam(value = "name" )String name){
        return "Hello " + name + "Welcome To BridgeLabz";
    }
    /**
     * UC:3
     * Purpose : Use GET Request Method and pass name as path variable
     * @param name
     * @return
     */
    @GetMapping(value= "/param/{name}")
    public String sayHelloParam(@PathVariable String name){

        return "Hello " + name + " Welcome To BridgeLabz";
    }
}