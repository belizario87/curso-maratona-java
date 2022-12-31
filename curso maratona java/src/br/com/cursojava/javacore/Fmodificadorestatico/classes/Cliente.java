package br.com.cursojava.javacore.Fmodificadorestatico.classes;
// 0 - O bloco de inicializacao estatico e executado pela JVM quando carregar a classe (e executado apenas 1 vez)
// 1 - E alocado o espaco na memoria para o objeto que sera criado
// 2 - Cada atributo de classe e criado e inicializado com seus valores default ou valores explicitos
// 3 - E executado o bloco de inicializacao
// 4 - E executado o construtor
public class Cliente {
    private static int parcelas[];

    static {      // BLOCO DE INICIALIZACAO
        parcelas = new int[100];  //criando o objeto array

        for (int p = 1; p <= 100; p++) {
            parcelas[p - 1] = p;
        }

    }

    public Cliente() {                                     // METODO CONSTRUTOR

    }

    public static int[] getParcelas() {         //GETTERS AND SETTERS
        return parcelas;
    }

}

