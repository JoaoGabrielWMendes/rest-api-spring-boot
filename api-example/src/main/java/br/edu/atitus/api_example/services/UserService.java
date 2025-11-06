package br.edu.atitus.api_example.services;

import br.edu.atitus.api_example.entites.UserEntity;

public class UserService {
	public UserEntity save(UserEntity user) throws Exception {
		if (user==null) 
			throw new Exception("Objeto nulo!");
		if(user.getName()==null||user.getName().isEmpty()) {
			throw new Exception("Nome inválido");
		}
		user.setName(user.getName().trim());	

		if(user.getEmail()==null||user.getEmail().isEmpty()) {
			throw new Exception("Email inválido");
		}

		if(user.getPassword()==null||user.getPassword().isEmpty()||user.getPassword().length() < 8) {
			throw new Exception("Senha inválida");
			//TODO criar hash da senha
		}
		//TODO validar permissão cadastro Admins
		//TODO enviar para a camada repository
		return user;
	}
	//save é tanto para salvar quanto para atualizar
}

