package com.course.check.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
@RequestMapping	(value="/hello")
public  ResponseEntity <String> wishHello() {
	  return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	  }
@GetMapping("/hi")
ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hi!", HttpStatus.BAD_REQUEST);
}
}
