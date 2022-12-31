package br.com.cursojava.introducao.lacosderepeticao;

public class ExecicioEstruturaRepeticao2 {
    public static void main(String[] args) {
        //Dado valor de um carro descubra quantas vezes ele pode ser parcelado
        //Porem as parcelas nao podem ser menores do que 1000


        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ :" + valorParcela);
        }
    }
}
