import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Numero de los vectores
        System.out.print("Ingresa el numero de vectores: ");
        int n = scanner.nextInt();

        
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        // P rimer vector
        System.out.println("Ingrese los valores del primer vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorA[i] = scanner.nextInt();
        }

        // Segundo vector
        System.out.println("Ingrese los valores del segundo vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorB[i] = scanner.nextInt();
        }

        // Suma
        int[] suma = new int[n];
        for (int i = 0; i < n; i++) {
            suma[i] = vectorA[i] + vectorB[i];
        }

        // Resta 
        int[] resta = new int[n];
        for (int i = 0; i < n; i++) {
            resta[i] = vectorA[i] - vectorB[i];
        }

        // Resultados
        System.out.println("\nResultado de la suma:");
        mostrarVector(suma);

        System.out.println("\nResultado de la resta:");
        mostrarVector(resta);

        scanner.close();
    }

  
    private static void mostrarVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
