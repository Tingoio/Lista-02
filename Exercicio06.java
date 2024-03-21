public class Exercicio06 {
    public static void executar(){
        double[] notas = new double[3];
        double[] pesos = new double[3];
        double mediaPond = 0, soma = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota "+(i+1)+" : ");
            pesos[i]  = Prompt.lerDecimal("Digite o peso da nota "+(i+1)+" : ");
            mediaPond += notas[i] * pesos[i];
        }
        for (int i = 0; i < notas.length; i++) {
            Prompt.imprimir("Notas: "+notas[i]);
            Prompt.imprimir("Pesos: "+pesos[i]);
            soma += pesos[i];
        }
        Prompt.imprimir("média ponderada: "+mediaPond / soma);

    }
}
