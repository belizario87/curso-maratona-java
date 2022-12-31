package br.com.cursojava.introducao.estruturascondicionais;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprima os dias da semana com relacao a 1,2,3,4,5,6,7
        byte dia = 7;
        char sexo = 'K';

        switch (sexo) {
            default:
                System.out.println("Opcao invalida");break;
            case 'F':
                System.out.println("O sexo e feminino");
                break;
            case 'M':
                System.out.println("O sexo e masculino");
                break;
        }


        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
        }

    }

}
/***
 * Os unicos tipos primitivos que podem ser usados no switch case
 * Byte, short, char, int, enum e String
 *
 *
 *
 */