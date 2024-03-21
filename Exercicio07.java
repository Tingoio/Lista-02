public class Exercicio07{
    public static void executar(){
        double[] vetor1 = new double[3];
        double[] vetor2 = new double[3];
        int identicos = 0;

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Prompt.lerDecimal("Digite  o "+(i+1)+" valor do vetor A: ");
            vetor2[i] = Prompt.lerDecimal("Digite  o "+(i+1)+" valor do vetor B: ");
        }
        for (int i = 0; i < vetor1.length; i++) {
            if(vetor1[i]==vetor2[i]){
                identicos++;
            }
        }
        if(identicos==3){
            Prompt.imprimir("Vetores idênticos.");
        }
        else{
            Prompt.imprimir("Vetores diferentes.");
        }

    }
}