package com.course.check.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
@RequestMapping	(value="/hello")
public  ResponseEntity <String> wishHello() {
	  return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	  }
@GetMapping("/module/get/hello")
ResponseEntity<String> hello() {
    return new ResponseEntity<>("“Done with first API...Backend learning on fire”", HttpStatus.OK);
}

@PostMapping("/module/post/{name}")
 public  ResponseEntity <String> postName(@PathVariable String name){
	String message= String.format("A successful post api created by %s ", name );
	 return new ResponseEntity <>( message , HttpStatus.CREATED);
	
}
//
//@PostMapping("/module/post/{name}")
//ResponseEntity <String> postName(@PathVariable String name){
//	
//	return new ResponseEntity<>(name )
//}
}
