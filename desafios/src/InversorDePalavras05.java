import java.util.Scanner;

public class InversorDePalavras05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraInvertida = "";
        
        System.out.println("Digite uma palavra para ser invertida: ");
        String palavraUsuario = scanner.nextLine();

        for ( int i = palavraUsuario.length() -1 ; i >= 0 ; i--){
            palavraInvertida = palavraInvertida + Character.toString(palavraUsuario.charAt(i));
        }
        System.out.println(palavraInvertida);

        scanner.close();
    }
}
