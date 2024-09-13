package com.se.simplerepo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class Controller {

    @GetMapping("/getdata")
    public ResponseEntity<String> getData(){
        System.out.println("test endpoint");
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @PostMapping("/getEmployeeDetails")
    public ResponseEntity<String> getEmployeeDetails(){
        return new ResponseEntity<>("Hello Employee",HttpStatus.OK);
    }


}
