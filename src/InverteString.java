import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String entrada = sc.nextLine();
        String saida = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            saida += entrada.charAt(i);
        }

        System.out.println("String invertida: " + saida);
    }
}