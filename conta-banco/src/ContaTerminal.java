import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        int digito;
        int  agencia;
        String nomeCliente;
        double saldo = 100.00;

     

        System.out.println("Seja Bem Vindo(a)!!!! ");
        
        System.out.println("Para Abrir sua Conta Bancária Siga os Passos a Seguir \n");

            Scanner ler = new Scanner (System.in);

        
                System.out.print("Informe a sua Agência Bancária sem o Dígito: ");
                agencia = ler.nextInt();
                
                System.out.print("Informe o Dígito da Agência: ");
                digito = ler.nextInt();
                
                System.out.println("\n");
            

                System.out.print("Informe o número da Conta sem o Dígito: ");
                numero = ler.nextInt();
   
                System.out.print("Informe o Dígito da sua conta: ");
                digito = ler.nextInt();
                
                System.out.println("\n");

           

                System.out.print("Infome o nome do Titular da Conta: ");

                nomeCliente = ler.nextLine();

                    // Aqui foi repetido a linha de código acima para limpar o buffer 
                nomeCliente = ler.nextLine();

    
                System.out.println(" ");

                System.out.println("Olá "  + nomeCliente);
                System.out.println("Obrigado por criar uma conta em nosso Banco \n ");
                System.out.println("Sua Agência é : " + agencia +"-" + digito);
                System.out.println("Conta : " + numero +"-" + digito);
                System.out.println("Saldo Disponível para Saque : " + saldo);


    }
}
