/*
 * 6. Crie um programa que converta horas em segundos, conforme o valor que o usuário 
 *informar quando solicitado a ele.
 */
import java.util.Scanner;

public class HorasParaSegundos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o número de horas: ");
			
			int horas = scanner.nextInt();
			int segundos = horas * 3600; // 1 hora = 3600 segundos
			System.out.printf("%d hora(s) equivale(m) a %d segundo(s).%n", horas, segundos);
		}
    }
}
