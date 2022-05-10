package br.dio.exercicio.array;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-4, -12, 15, 34, 6};
        // unidemensionais são transmitidos os valores, aleatórios, para o array.
        // contém 5 numeros aleatórios, mas 6 elementos, pois o '0', mesmo q não declarado, faz parte.

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {

            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --); {
            System.out.println(vetor[i] + " ");
        }

    }
}
