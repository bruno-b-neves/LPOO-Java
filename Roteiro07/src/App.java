import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	
	public static void validarIdade(int idade) throws Exception {
		if (idade <= 0) {
			throw new Exception("idade menor ou igual a zero");
		}
	}
	
	public static void valideNumeroDivisivel(int numeroDivisivel) throws Exception {
		if (numeroDivisivel == 0) {
			throw new Exception("número não pode ser divisivel por 0");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
	
		int primeiroNumero = 0;
		int segundoNumero = 0;
		
		try {
			System.out.println("Digite o seu nome:");
			String nome = input.next();
			
			System.out.println("Digite a sua idade nome:");
			int idade = input.nextInt();
			
			input.nextLine();
		
			validarIdade(idade);
			
			Usuario user = new Usuario();
			user.nome = nome;
			user.idade = idade;
			
			// Dividindo os Números que o usuario digitar
			System.out.println("Digite o primeiro numero: ");
			primeiroNumero = input.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			segundoNumero = input.nextInt();
			
			input.nextLine();
			
			int resultado = primeiroNumero / segundoNumero;
			
			System.out.println("Seu nome é: " + user.nome + " e sua idade é de: " + user.idade);
			System.out.println("O resultado da divisão é: " + resultado);
			
		} catch (InputMismatchException e) {
			System.out.println("Desculpe não entendi");
		} catch (ArithmeticException e) {
			valideNumeroDivisivel(segundoNumero);
		} finally {
			System.out.println("true");
		}

	}
}
