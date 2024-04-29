import java.util.*;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor desejado: ");
          valorSolicitado = ler.nextDouble();

        if ( valorSolicitado <= saldo){
            saldo = (saldo - valorSolicitado);
            System.out.println(saldo);
        }
        else
        System.out.println("Saldo Insuficiente");
      

    }

}
