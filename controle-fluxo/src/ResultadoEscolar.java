import java.util.*;

public class ResultadoEscolar {

    
    public static void main(String[] args) {
        double notaDoAluno;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a nota do Aluno ");
        notaDoAluno = ler.nextDouble();

    //     if (notaDoAluno >= 7.0){
    //         System.out.println("Aluno Aprovado");
    //     }
    //     else
    //     if (notaDoAluno > 6.0 && notaDoAluno < 7.0 )
    //     {
    //     System.out.println("Aluno em Recuperação");
    //     }
    //     else
    //     System.out.println("Aluno Reprovado");
    // }

    //  condição ternária 

    String resultado = notaDoAluno >= 7.0 ? "Aluno Aprovado" : notaDoAluno >= 6.0 && notaDoAluno < 7.0 ? "Aluno em Recuperação" : "Aluno Reprovado";

    System.out.println(resultado);

    }
}
