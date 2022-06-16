
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 16;
		int quatidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else if (quatidadePessoas >= 2) {
			System.out.println("Você não é maior de idade, mas pode entrar por estar acompanhado");
		} else {
			System.out.println("Você não é maior de idade");
		}

	}

}
