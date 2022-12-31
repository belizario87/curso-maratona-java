package br.com.cursojava.javacore.Gassociacao.teste;

import br.com.cursojava.javacore.Gassociacao.classes.Aluno;
import br.com.cursojava.javacore.Gassociacao.classes.Seminario;
import br.com.cursojava.javacore.Gassociacao.classes.Professor;
import br.com.cursojava.javacore.Gassociacao.classes.Local;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Leonardo Belizario", 35);  // Criacao e instancia dos objetos
        Aluno aluno2 = new Aluno("Joana D'arc", 20);
        Seminario sem = new Seminario("Como ser um baita programador e ficar rico");
        Seminario sem2 = new Seminario("Como aprender a programar em ate 1 ano");
        Professor prof = new Professor("Yoda", "Usar a forca para programar");
        Local local = new Local("Rua das araras", "Mato");

        aluno.setSeminario(sem);                            //Associacao de objetos
        aluno2.setSeminario(sem);
        sem.setProfessor(prof);
        //sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno, aluno2});       // Criacao e associacao do array Aluno
        prof.setSeminario(new Seminario[]{sem, sem2});
//        Seminario[] semProf = new Seminario[2];         // Criacao do objeto array(semProf) com duas posicoes
//        semProf[0] = sem;
//        semProf[1] = sem2;
//        prof.setSeminario(semProf);


        aluno.print();                         //Imprimindo os objetos associados
        aluno2.print();
        prof.print();
        sem.print();


    }


}
