public class Exercicio13 {
    public static void executar(){
        int n = Prompt.lerInteiro("Digite um valor n: ");
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                vetor[i] = 1;
            } else {
                vetor[i] = vetor[i - 1] + vetor[i - 2];
            }
        }

        Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci: ");
        for (int i = 0; i < vetor.length; i++) {
            Prompt.imprimir(vetor[i] + " ");
        }
    }
}
