import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque o primeiro valor: ");
		double num1 = scanner.nextDouble();

		System.out.print("Coloque o segundo valor: ");
		double num2 = scanner.nextDouble();

		System.out.print("Coloque o terceiro valor: ");
		double num3 = scanner.nextDouble();

		System.out.print("Coloque o terceiro valor: ");
		double num4 = scanner.nextDouble();
		
		System.out.println("A media aritmetica dos valores é: " + ((num1 + num2 + num3 + num4) / 4));
	} 
}