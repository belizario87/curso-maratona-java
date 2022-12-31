package br.com.cursojava.javacore.Bintroducaometodos.test;

import br.com.cursojava.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        //Calculadora calc = new Calculadora(); //Cria o objeto

        System.out.println("Soma dois numeros");
        Calculadora.somaDoisNumeros(); // Chama o metodo sem argumento

        System.out.println("Subtrai dois numeros");// Chama os metodos sem argumentos
        Calculadora.subtraiDoisNumeros();            // Chama os metodos sem argumentos


        System.out.println("Multiplica dois numeros");
        Calculadora.multiplicaNumeros(55.5, 10);  // Chama os metodos com argumentos mas sem retorno(void)

        System.out.println("Divide dois numeros");
        double result = Calculadora.divideDoisNumeros(20, 5); // Chama os metodos com os argumentos e com retorno (return)
        System.out.println(result);

        System.out.println("Divide dois numeros diferentes de zero");
        Calculadora.imprimeDoisNumerosDifZero(20, 0);      // Chama os metodos com os argumentos mas sem retorno, e considera
        // na logica o erro da divisao por 0


        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Inicializando o array
        int[] numeros2 = new int[]{1,2,3,4,5}; // Inicializando o segundo array

        System.out.println("Soma um array de numeros");

        Calculadora.somarArray(numeros); //chama o metodo com argumento do array inicializado


        System.out.println("Soma os argumentos de um array");
        Calculadora.somaVarArgs(1, 2, 3, 4, 5); //Chama o metodo com argumentos definidos

        System.out.println("Continuando a execucao");

    }
}
