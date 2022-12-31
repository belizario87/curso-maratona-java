package br.com.cursojava.javacore.Bintroducaometodos.test;

import br.com.cursojava.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Marcelo Pereira");
        estudante.setIdade(15);
        estudante.setNotas(new double[]{2, 4, 1.5});



       estudante.imprimirDados();
       estudante.imprimirMedia();
       System.out.println("Aprovado? " + estudante.isAprovado());


    }
}
