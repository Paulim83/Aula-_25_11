import java.util.Scanner;
public class numerosecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 7;
        int tentativa =1000;
        
        while (tentativa != numeroSecreto) {
            System.out.println("Adivinhe o número secreto (entre 1 e 100): ");
            tentativa = sc.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Parabéns! Você adivinhou o número secreto!");
            }
        }
        
    }
    
}
