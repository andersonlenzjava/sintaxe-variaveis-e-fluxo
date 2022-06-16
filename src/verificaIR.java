
public class verificaIR {

	public static void main(String[] args) {

		double salario = 130.0;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("você pode deduzir R$ 142");
			System.out.println("sua dedução é de: " + (salario * 0.075) + " reais");
		} else if (salario >= 2800.01 && salario <= 3500) {
			System.out.println("você pode deduzir R$ 350");
			System.out.println("sua dedução é de: " + (salario * 0.075) + " reais");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("você pode deduzir R$ 636");
			System.out.println("sua dedução é de: " + (salario * 0.075) + " reais");
		}else if( salario < 1900) {
			System.out.println("voce é isento");
		}
	}
}
