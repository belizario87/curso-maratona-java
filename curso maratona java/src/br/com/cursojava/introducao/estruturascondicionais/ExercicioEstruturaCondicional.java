package br.com.cursojava.introducao.estruturascondicionais;

public class ExercicioEstruturaCondicional {
    /*
Crie uma variavel salario e imprima o salario com o imposto calculado
salario < 1000 = 5% de imposto
salario >= 1000 e salario < 2000 = 10% de imposto
salario > 2000 >= e salario < 4000 = 15% de imposto
salario > 5000 = 20% de imposto
   */
    public static void main(String[] args) {
        int salario = 4000;
        double totalImposto = 0;
        double salarioComImposto = salario + totalImposto;

        if (salario < 1000) {
            totalImposto = salario * 0.05;
            salarioComImposto = salario + totalImposto;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.10;
            salarioComImposto = salario + totalImposto;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
            salarioComImposto = salario + totalImposto;
        } else if (salario >= 4000 && salario < 5000) {
            totalImposto = salario * 0.20;
            salarioComImposto = salario + totalImposto;
        } else {
            totalImposto = salario * 0.25;
            salarioComImposto = salario + totalImposto;
        }
        System.out.println("O valor a pagar com imposto e de: "+ salarioComImposto);
    }
}
