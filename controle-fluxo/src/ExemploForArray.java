import java.util.*;

public class ExemploForArray {
    public static void main(String[] args) {

        String alunos[] = {"Joao","Bruna","Pedro", "Maria","Jose","Marcos"};
        
    //     for( int i = 0; i < alunos.length; i++){
    //         System.out.println(alunos[i] + " = " + i);
    //     }
    // }

    //For each ( for melhorado) usado para arrays ou coleção

    for(String aluno: alunos){
        System.out.println("aluno(a) = " + aluno);
    }

  }
}
