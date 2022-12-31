package br.com.cursojava.javacore.Eblocodeinicializacao.classes;

// 1 - E alocado o espaco na memoria para o objeto que sera criado
// 2 - Cada atributo de classe e criado e inicializado com seus valores default ou valores explicitos
// 3 - E executado o bloco de inicializacao
// 4 - E executado o construtor
public class Cliente {
    private int parcelas[];

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");   // BLOCO DE INICIALIZACAO
        for (int p = 1; p <= 100; p++) {
            parcelas[p - 1] = p;

        }
    }

    public Cliente() {                                     // METODO CONSTRUTOR

    }

    public int[] getParcelas() {         //GETTERS AND SETTERS
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }


}


