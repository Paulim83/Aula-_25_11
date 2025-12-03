import java.util.Scanner;

public class Cor_do_CD_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verificador da cor do CD!");
        System.out.println();
        while (true) {
            System.out.print("Insira a cor do CD desejado: ");
            String cd = sc.nextLine();
            if (cd.equals("Azul")) {
                System.out.println("Este CD custa R$ 10,00!");
                break;
            } else {
                if (cd.equals("Vermelho")) {
                    System.out.println("Este CDcusta R$20,00!");
                    break;
                } else {
                    if (cd.equals("Amarelo")) {
                        System.out.println("Este CD custa R$30,00!");
                        break;
                    } else {
                        System.out.println("Cor invalida, tu roubou este CD em outra loja irmão");
                    }
                }
            }
        }
    }
}