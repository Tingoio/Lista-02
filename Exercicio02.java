public class Exercicio02 {
    public static void executar(){
        double[] vetor = new double[5];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Prompt.lerDecimal("Digite um número: ");
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 0){
                Prompt.imprimir(vetor[i]+ " é positivo!");
            }
            else if(vetor[i] == 0){
                Prompt.imprimir(vetor[i]+ " é zero!");
            } 
            else{
                Prompt.imprimir(vetor[i]+ " é negativo!");
            }
        }
    }
}
