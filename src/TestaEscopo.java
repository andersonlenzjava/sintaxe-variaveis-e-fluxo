
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 19;
		int quatidadePessoas = 3;//sempre precisa ser inicializada uma variavel
		
		boolean acompanhado; 

		if(quatidadePessoas >= 2) {
			acompanhado = true;// a variavel so existe dentro do bloco (escopo) se for inicializada aqui dentro
		}else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar ");
		}

	}

}

	

