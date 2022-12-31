package br.com.cursojava.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public static void somaDoisNumeros() {         // Aonde vc cria as funcoes

        System.out.println(5 + 5);
    }

    public static void subtraiDoisNumeros() {  //Passando o parametro dentro dos metodos sem retorno

        System.out.println(5 - 5);
    }

    public static void multiplicaNumeros(double num1, double num2) { //Passando o parametro dentro dos metodos sem retorno
        System.out.println(num1 * num2);
    }

    public static double divideDoisNumeros(double num1, double num2) {  //Passando o parametro dentro dos metodos com retorno
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public static void imprimeDoisNumerosDifZero(double num1, double num2){ // Passando o parametro dentro dos metodos sem retorn(void)
        if(num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("***O numero zero nao e divisivel***");
    }

    public static  void somarArray (int[] numeros){  //Passando parametros em array para metodo sem retorno que soma um arrray
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarArgs (int...numeros2){ //Passando parametros que sao somados dentro dos argumentos.
        int soma = 0;
        for(int num : numeros2){
            soma += num;
        }
        System.out.println(soma);
    }
}
/***
 * Uma funcao pode ter retorno ou nao, se nao tiver retorno e chamada de void.
 * Caso a funcao tenha retorno devera ser declarado o tipo na criacao do metodo e declarado um return ao final da expressao.
 *
 *
 *
 *
 */

