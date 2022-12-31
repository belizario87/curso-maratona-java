package br.com.cursojava.introducao.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 21;
        float salario = 2000;

        System.out.println(salario < 1000 && idade < 18);
        System.out.println(salario > 1000 || idade < 18);

    }
}
/***
 * Operador E(AND) = &&      ----> True + True = True / True + False = False
 * Operador OU(OR) = ||      ----> True + False = True / False + True = True
 *
 *
 *
 */