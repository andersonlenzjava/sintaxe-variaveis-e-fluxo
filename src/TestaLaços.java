
public class TestaLa�os {

	public static void main(String[] args) {

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {//comunica��o entre os for 
				if(coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
