package br.edu.atitus.api_example.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.api_example.dtos.SignUpDTO;
import br.edu.atitus.api_example.entites.TypeUser;
import br.edu.atitus.api_example.entites.UserEntity;
import br.edu.atitus.api_example.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private final UserService service = new UserService();
	
	@PostMapping("/signup")
	public ResponseEntity<UserEntity> postSignup(@RequestBody SignUpDTO dto) throws Exception{
		UserEntity user=new UserEntity();
		BeanUtils.copyProperties(dto, user);
		user.setType(TypeUser.Common);
		service.save(user);
		return ResponseEntity.status(201).body(user);
		
	}
}
