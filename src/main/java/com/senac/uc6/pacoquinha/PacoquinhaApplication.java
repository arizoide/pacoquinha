package com.senac.uc6.pacoquinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacoquinhaApplication {

	public static void main(String[] args) {
		var texto = "Eu sou o ";
		System.out.println(texto + "Ari");
		SpringApplication.run(PacoquinhaApplication.class, args);
	}

}
