package br.com.cursojava.javacore.Aintroducaoclasses.test;

import br.com.cursojava.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "12419251784";
        prof.matricula = "121212";
        prof.rg = "28401-1";
        prof.nome = "Leonardo Belizario";

        Professor prof2 = new Professor();
        prof2.cpf = "456987508";
        prof2.matricula = "999999";
        prof2.rg = "87589-1";
        prof2.nome = "Marcelo Oliveira";

        System.out.println("CPF: "+ prof.cpf);
        System.out.println("Matricula: " + prof.matricula);
        System.out.println("RG:  " + prof.rg);
        System.out.println("Nome: " + prof.nome);

        System.out.println("----------------------------------");

        System.out.println("CPF: "+ prof2.cpf);
        System.out.println("Matricula: " + prof2.matricula);
        System.out.println("RG: " + prof2.rg);
        System.out.println("Nome: " + prof2.nome);

    }
}
