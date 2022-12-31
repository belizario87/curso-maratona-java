package br.com.cursojava.javacore.Bintroducaometodos.classes;

//Crie os seguintes atributos para essa classe
// Nome
// Matricula
// Rg
// CPF
// Crie uma classe de teste para preencher e imprimir os dados desse professor
public class Professor {
    public String nome;
    public String rg;
    public String cpf;
    public String matricula;

    public void imprimirProfessor(){
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);;


    }
}


