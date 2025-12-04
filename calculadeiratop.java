import java.util.Scanner;

public class calculadeiratop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você acaba de entrar na Calculadeira + top do Brasil");
        System.out.println();
        int cont = 1;
        while (cont <= 3) {
        System.out.print("Insira o primeiro número da conta: "); 
        System.out.println();
        int num1 = sc.nextInt();      
        System.out.print("Insira o segundo número da conta: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.printf("Soma: %d\n" ,soma);
        int sub =num1-num2;
        System.out.printf("Subtração: %d\n", sub);
        int mult = num1 * num2;
        System.out.printf( "Multiplicação: %d\n", mult);
        cont = cont +1;        
 }
sc.close();
}
}