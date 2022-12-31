package br.com.cursojava.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5}; //tamanho: 5 e index: 0 ate 4
        int[] numeros3 = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numeros2.length; i++) { //for normal
            System.out.println(numeros2[i]);
        }

        for (int num : numeros2) {
            System.out.println(num); //for each
        }
    }
}
/***
 * Tres formas diferentes de criar um array
 * for each abrevia a forma de percorrer um array
 *
 */