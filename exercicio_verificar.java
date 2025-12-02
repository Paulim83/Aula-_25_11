import java.util.Scanner;

public class exercicio_verificar {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println( "Verificador de maior idade!");
    System.out.println();

    System.out.print("Insira sua idade: ");
    int idade = sc.nextInt();

    if (idade >= 18) {
     if (idade >= 60) {
        System.out.println("Essa pessoa é idosa.");
    } else {
        System.out.println( " A pessoa não é idosa, porém é maior de idade");
    }
   } else {
    System.out.println( "Você é menor de idade");
   }
    sc.close();
 }
}
