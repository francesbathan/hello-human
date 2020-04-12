package com.frances.hellohuman;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HumanController {
	@RequestMapping("/your_server/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "<h1>Hello Human!</h1> Welcome to Spring Boot!";
		}
		else {
			return "<h1>Hello " + searchQuery + "!</h1> Welcome to Spring Boot!";
		}
    }

}
