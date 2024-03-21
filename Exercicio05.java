public class Exercicio05 {
    public static void executar(){
        double[] vetor = new double[5];
        double n = Prompt.lerDecimal("Digite um valor para N: ");
        int qtd = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerDecimal("Digite um número: ");
            if(vetor[i]==n){
                qtd++;
            }
        }
        Prompt.imprimir("O valor "+n+" aparece "+qtd+ " vezes no vetor");
    }
}
