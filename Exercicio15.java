public class Exercicio15 {
    public static void executar(){
        double[] vetor = new double[5];
        double numero = 0;
        
        vetor[0] = Prompt.lerDecimal("Digite o primeiro número: ");
        for (int i = 1; i < vetor.length; i++) {
            numero = Prompt.lerDecimal("Digite o próximo número: ");

            if(numero>vetor[i-1]){
                vetor[i] = numero;
            }
            else{
                Prompt.imprimir("Valor inválido. Digite um valor maior do que o anterior.");
                i--;
            }
            
        }
        for (int i = 0; i < vetor.length; i++) {
            Prompt.imprimir("Vetor preenchido: "+vetor[i]);
        }
    }
}
