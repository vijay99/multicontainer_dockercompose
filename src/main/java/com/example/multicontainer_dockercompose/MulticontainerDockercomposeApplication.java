package com.example.multicontainer_dockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MulticontainerDockercomposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MulticontainerDockercomposeApplication.class, args);
	}


	@GetMapping("/multicontainer")
	public String printMessage(){
		return "This is multi container docker compose application";
	}

}
