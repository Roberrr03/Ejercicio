import java.util.Scanner;

// programa en Java para calcular el factorial de un número ingresado por el usuario
public class FactorialCalculator {
    public static void main(String[] args) {
		System.out.println("Hola mundo, linea añadida por Jose");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        
        System.out.println("El factorial de " + number + " es: " + factorial);
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
