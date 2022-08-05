/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */
package com.bridgelabz.springrestapimessagingapp.com.controller;

import com.bridgelabz.springrestapimessagingapp.com.model.UserInfo;
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
    /**
     * UC: 4
     * @PostMapping : this annotation handle the post type of annotation
     * @RequestBody : is used to convert the body of HTTP request to java class object
     *http://localhost:8088/post?Content-type=json : URL request through POSTMAN
     * JSON:{
     *          "firstName":"Santhosh",
     *          "lastName" : "Naik"
     *      }
     * O/P ; Hello Santhosh Naik Welcome To BridgeLabz
     */
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserInfo userInfo ){
        return "Hello " + userInfo.getFirstName() +" "+userInfo.getLastName() + " Welcome To BeidgeLabz";

    }
    /**
     * UC:5
     * @PostMapping: mapping HTTP POST requests onto specific handler methods Use POST Request Method and pass first name and last name in the Body;
     *URL: http://localhost:8088/hello/put/Santhosh?lastName=Naik
     * O/P: http://localhost:8088/hello/put/Santhosh?lastName=Naik
     */
    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam (value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + " Welcome to BridgeLabz";

    }
}