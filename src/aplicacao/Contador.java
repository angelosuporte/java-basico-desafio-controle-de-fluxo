package aplicacao;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro ");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro ");
		int parametroDois = sc.nextInt();
		
		try{
			for(int i = 0; i <= parametroUm;) {
				contar(parametroUm, parametroDois);
				break;
			}
			
		}catch(ParametrosInvalidosException exception){
			System.out.println("Erro: " + exception.getMessage());
			
		}
		
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois) {
			System.out.println("O parametroUm não pode ser maior que o parametroDois");
		}else {
			int contagem = parametroDois - parametroUm;
			for(int i = 0; i <= contagem; i++) {
				System.out.printf("%d%c ", i, i==contagem ? 00:44);
				//https://pt.stackoverflow.com/questions/534106/quero-imprimir-os-valores-separados-por-virgulas-mas-no-final-fica-uma-virgula-q
			} 
			
		}
	}

}
