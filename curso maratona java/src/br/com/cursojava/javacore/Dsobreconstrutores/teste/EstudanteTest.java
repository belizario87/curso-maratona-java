package br.com.cursojava.javacore.Dsobreconstrutores.teste;


import br.com.cursojava.javacore.Dsobreconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("13145", "Leonardo", new double[]{7.6,5.1,2}, "11/12/22");
        Estudante est2 = new Estudante("15345", "Joao batista", new double[]{1.5, 2.6, 7.8},"01/05/21");


        est.imprime();
        est2.imprime();
    }
}
