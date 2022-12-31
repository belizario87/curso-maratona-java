package br.com.cursojava.introducao.lacosderepeticao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int contador = 0;
        while (contador > 10) {
            System.out.println(contador);
            contador++;
        }
        do {
            System.out.println("Executou o do while: " + contador++);
        } while (contador > 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("O valor de i eh: " + i);
        }
    }
}


/***
 * while repete a condicao e entra no bloco de codigo apenas se a condicao for verdadeira.
 * do while repete a condicao pelo menos e entra no bloco de codigo pelo menos uma vez mesmo a condicao sendo falsa.
 * for voce controla quantas vezes o bloco de codigo sera executado
 */
