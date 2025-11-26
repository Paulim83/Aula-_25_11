import java.util.Scanner;
public class aula2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Título 
    System.out.println("=== Cadastro Simples ===");
    System.out.println();
    //Insersões
    System.out.print("Digite seu nome ");
    String nome = sc.nextLine();
    System.out.print( "Digite sua idade");
    int idade = sc.nextInt();
    System.out.print("s: Digite sua cidade ");
    sc.nextLine(); // limpar buffer
    String cidade = sc.nextLine();
    System.out.print( "Digite o seu salário: ");
    //int salario = sc.nextInt();
    
    //double salario =sc.nextDouble();
    float salario =sc.nextFloat();


    // Linha em branco
    System.out.println();

    //Impressões
    System.out.println("===Dados Informados===");
    System.out.print("Nome: ");
    System.out.println(nome);

    System.out.print( "Idade: ");
    System.out.println(idade);

    System.out.print( "Cidade: ");
    System.out.println(cidade);

    System.out.printf("Salário: %.3f\n", salario);

    System.out.println();
    System.out.println("Cadastro concluído!");

    sc.close();
    }
}   

