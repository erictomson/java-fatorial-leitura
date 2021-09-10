import java.util.Scanner;

public class Fatorial {

    //Leia um número N e que indique quantos valores inteiros e
    //positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o
    //valor lido e o fatorial desse valor
    public static void main(String[] args) {
        // Quantidade de números a serem lidos
        int N;
        // Número lido que será fatorado
        int numero;
        // Configurar Scanner para leitura dos número
        Scanner scanner = new Scanner(System.in);
        // Resultado do fatorial
        int fatorial;

        // Solicitar quantidade de números a serem lidos
        System.out.println("Quantidade de números a serem lidos: ");
        // Leitura do número
        N=scanner.nextInt();
        // Limpeza do buffer [ENTER do nextInt() anterior]
        scanner.nextLine();

        // Lendo os números e imprimindo a tabela número/fatorial
        for(int i=0;i<N;i++) {
            // Solicitar o número a ser calculado
            System.out.println("Digite o " + (i+1) + "o. número: ");
            // Leitura do número
            numero=scanner.nextInt();
            // Limpeza do buffer [ENTER do nextInt() anterior]
            scanner.nextLine();
            // Inicializar fatorial
            fatorial=1;
            // Cálculo do fatorial
            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
            }
            // Imprimindo a tabela
            System.out.println("Número lido: " + numero + " | Fatorial: " + fatorial + " \n");
        }
    }
}
