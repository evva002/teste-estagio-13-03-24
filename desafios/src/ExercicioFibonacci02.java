import java.util.Scanner;

public class ExercicioFibonacci02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        long numeroAnterior = 0;
        long numeroAtual = 1;

        System.out.println("Digite um número: ");
        long numeroUsuario = scanner.nextLong();

        while (numeroAtual < numeroUsuario) {
            long proximo = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximo;
            contador++;
        }

        if (numeroAtual == numeroUsuario) {
            System.out.println(
                    "O número " + numeroUsuario + " faz parte da sequência de Fibonacci na posição " + contador);
        } else {
            System.out.println("O número " + numeroUsuario + " não faz parte da sequência de Fibonacci");
        }

        scanner.close();

    }

}
