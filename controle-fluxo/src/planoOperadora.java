import java.util.*;

public class planoOperadora {

    public static void main(String[] args) {

        String op;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Seja Bem Vindo(a)");
        System.out.println("Escolha o Plano Desejado");

        System.out.println("Digite 1 para Plano Básico = 100 minutos de Ligação");

        System.out.println("Digite 2 para Plano Médio = 100 minutod de Ligação + Whatsapp e  Instagram Grátis");

        System.out.println("Digite 3 para Plano Turbo = 100 minutos de Ligação + Whatsapp , Instagram e 5G de youtube Grátis");

        op = ler.next();

        switch (op){
            case "1":{
                System.out.println("Parabéns você adquiriu o plano Básico");
                break;
            }

            case "2":{
                System.out.println("Parabéns você adquiriu o plano Médio");
                break;
            }

            case "3":{
                System.out.println("Parabéns você adquiriu o plano Turbo");
                break;
            }

            default:{
                System.out.println("Opção Inválida");
            }

        }



    }
    
}
