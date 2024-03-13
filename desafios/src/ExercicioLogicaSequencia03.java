public class ExercicioLogicaSequencia03 {
    public static void main(String[] args) {
        
        int i;

        System.out.println("A - Incremento de + 2");
        for (i=1; i <=10 ; i = i + 2){
            System.out.println(i);
        }

        System.out.println("B - O dobro do anterior");
        for (i=2; i <=128 ; i = i * 2){
            System.out.println(i);
        }

        System.out.println("C - O quadrado dos números naturais");
        for (i=0; i <=10 ; i ++){
            System.out.println(i * i);
        }

        System.out.println("D - O quadrado dos números pares naturais");
        for (i=0; i <=10 ; i = i + 2){
            System.out.println(i * i);
        }

        System.out.println("E - Sequencia de Fibonacci");
        sequenciaFibonacci(0); 

        System.out.println("F - Primeira letra; Próximo número seria 200 (duzentos)");
        /*
         * a principio nao parece ter lógica, porém percebi que a primeira letra
         * dos números começa sempre com "D"
         * Não faço ideia de como ler todos os números em sequencia e fazer o código identificar
         * se ele começa com a letra d ou não; mas o próximo número é 200
         */
           
    }

    public static void sequenciaFibonacci(int numeroTermos) {
        int i;
        int num1 = 1, num2 = 0;
            System.out.println(num2);
            System.out.println(num1);
        for(i = 0; i < 6; i++){
            
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
      }
      
    
      
}
