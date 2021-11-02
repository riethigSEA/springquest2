package com.example.springquest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class Springquest2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springquest2Application.class, args);
	}


	@RequestMapping("/doctor/{id}")
	@ResponseBody
	public String handling(@PathVariable int id){

		switch (id) {
			case 1,2,3,4,5,6,7,8: throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Keine Infos über Doctor hinterlegt");
			case 9:
				return "{\"number\": 9, \"name\": \"Christopher Eccleston\"}";
			case 10:
				return "{\"number\": 10, \"name\": \"David Tennant\"}";
			case 11:
				return "{\"number\": 11, \"name\": \"Matt Smith\"}";
			case 12:
				return "{\"number\": 12, \"name\": \"Peter Capaldi\"}";
			case 13:
				return "{\"number\": 13, \"name\": \"Jodie Whittaker\"}";
			default:
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to retrieve the incarnation " + id);
		}

	}
}


