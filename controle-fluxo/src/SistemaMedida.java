import java.util.*;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String op;

        System.out.println("Sistema de Medida");

        System.out.println("Digite P , M ou G para o tamanho da sua Medida");

        op = ler.next();

        switch (op){
            case "p":{
                System.out.println("Seu tamanho é Pequeno");
                break;
            }

            case "m":{
                System.out.println("Seu tamanho é Médio");
                break;
            }

            case "g":{
                System.out.println("Seu tamano é Grande");
                break;
            }

            default:{
                System.out.println("Tamanho Indefinido");
            }

        }


    }
}
