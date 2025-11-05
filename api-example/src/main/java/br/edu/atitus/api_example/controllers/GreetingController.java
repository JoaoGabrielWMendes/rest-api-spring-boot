package br.edu.atitus.api_example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")

//geralmente cada path tem o próprio controller
//cada vez que você aperta enter em uma URL ele faz um GET

public class GreetingController {
	
	//o get mapping diz que caso a requisição seja uma GET é pra exibir tal método
	@GetMapping(value= {"","/{namePath}"})//Isso é pra aceitar tanto com o parametro(?) quanto o /
	public ResponseEntity<String> getGreeting(
			@RequestParam(required=false) String name, 
			@PathVariable(required=false) String namePath) {
		String retorno="Hello";
		if (name== null) 
			name= namePath!=null ? namePath :"World!";
		return ResponseEntity.ok(retorno + " "+name+"!");
	}
	
//isso é um retorno mais organizado.
	
	
	
	
//REQUEST: tem o método(GET, POST, DELETE), o cabeçalho(como o authorization) e o body(por exemplo, caso você irá enviar um dado parao bd ele estará no corpo(GET não tem body))
//RESPONSE: Código status(200,300), o cabeçalho (cachips), body( o que foi retornado)
}
