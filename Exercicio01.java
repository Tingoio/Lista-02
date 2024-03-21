public class Exercicio01 {
    public static void executar(){
        double[] vetor = new double[5];
        double media = 0;

        for(int i=0;i<5;i++){
            vetor[i] = Prompt.lerDecimal("Digite um número: ");
            media += vetor[i];
        }
        media = media / 5;
        Prompt.imprimir("Media: " + media);
        for(int i=0;i<5;i++){
            if(vetor[i]<media){
                Prompt.imprimir("Menor que a média: " + vetor[i]);
            }
            else if(vetor[i]==media){
                Prompt.imprimir("Igual que a média: " + vetor[i]);
            }
            else{
                Prompt.imprimir("Maior que a média: " + vetor[i]);
            }
        }
    }   
}
