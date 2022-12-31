package br.com.cursojava.javacore.Bintroducaometodos.test;

import br.com.cursojava.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf ="124.192.517.84";
        prof.matricula = "121212";
        prof.nome = "Jose Aldo";
        prof.rg = "28401-1";


        Professor prof2 = new Professor();
        prof2.cpf ="154.253.533.82";
        prof2.matricula = "121212";
        prof2.nome = "Maria";
        prof2.rg = "24565-1";

        prof.imprimirProfessor();
        System.out.println("----------------");
        prof2.imprimirProfessor();

    }
}
