package com.ech.basicAuth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

/**
 * Created by Kavindu on 3/4/2018.
 */
@Controller
public class MainController {


    @RequestMapping("/user1")
    public ResponseEntity<?> getUser1() {
        return new ResponseEntity("user1", HttpStatus.OK);
    }


    @RequestMapping("/user2")
    public ResponseEntity<?> getUser2() {
        return new ResponseEntity("user2",HttpStatus.OK);
    }




   /* @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Orders" )  // 404
    public class OrderNotFoundException extends RuntimeException {

    }*/
}
