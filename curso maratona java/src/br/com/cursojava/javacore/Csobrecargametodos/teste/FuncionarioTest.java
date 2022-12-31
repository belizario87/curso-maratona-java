package br.com.cursojava.javacore.Csobrecargametodos.teste;

import br.com.cursojava.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Leonardo", "124.192.517-84", 4.500,"28401-1");
        Funcionario funcionario2 = new Funcionario(){

        };

        funcionario.imprimeFuncionario();
        System.out.println("--------------------");
        funcionario2.imprimeFuncionario();

    }
}
