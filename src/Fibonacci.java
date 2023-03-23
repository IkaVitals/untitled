import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = input.nextInt();

        int a = 0;
        int b = 1;
        int resultado = 0;
        boolean encontrado = false;


        while (resultado <= numero) {
            if (resultado == numero) {
                encontrado = true;
            }
            resultado = a + b;
            a = b;
            b = resultado;
        }

        if (encontrado) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}