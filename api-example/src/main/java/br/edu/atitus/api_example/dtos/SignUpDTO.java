package br.edu.atitus.api_example.dtos;

public record SignUpDTO(String name, String email, String password) {
	
}
//record é um registro específico em que você não precisa colocar o GET e é IMUTÁVEÇ
//ele é somente de leitura
//seria a mesma coisa que fazer um método construtor passando os parâmtros, mas fica mais facil com o record
