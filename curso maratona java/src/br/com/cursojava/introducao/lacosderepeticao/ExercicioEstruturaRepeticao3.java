package br.com.cursojava.introducao.lacosderepeticao;

//Dado valor de um carro descubra quantas vezes ele pode ser parcelado
//Porem as parcelas nao podem ser menores do que 1000
public class ExercicioEstruturaRepeticao3 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ :" + valorParcela);
        }
    }
}

/***
 * o break vai parar a interacao e nao fazer o que esta abaixo ser executado
 * e o continue vai
 *
 *
 */
