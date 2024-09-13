package com.se.simplerepo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping("/getdata")
    public ResponseEntity<String> getData(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);

    }

}
