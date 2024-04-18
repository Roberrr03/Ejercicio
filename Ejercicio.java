import java.util.Scanner;

// programa en Java para calcular el factorial de un número ingresado por el usuario
public class FactorialCalculator {
    public static void main(String[] args) {
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

//  programa en Java que crea un array de números enteros, los imprime y luego calcula la suma de todos los elementos del array:
import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // Llenar el array con valores ingresados por el usuario
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Imprimir el array
        System.out.println("Array ingresado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Calcular la suma de los elementos del array
        int sum = calculateSum(array);
        
        System.out.println("La suma de los elementos del array es: " + sum);
    }
    
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
