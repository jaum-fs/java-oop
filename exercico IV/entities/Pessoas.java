package entities;
public class Pessoas {
    
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoas(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void mediaPorcentagemMenores(Pessoas[] vetor){
        int qtdMenores16 = 0;
        for (Pessoas ind : vetor ){
            if (ind.getIdade() < 16){
                qtdMenores16++;
            }
        }
        double porcentagem = qtdMenores16*100 / vetor.length;
        System.out.printf("%nPessoas com menos de 16 anos: %.2f%s %n %n", porcentagem, "%");

        for (Pessoas ind : vetor ){
            if (ind.getIdade() < 16){
                System.out.println(ind.getNome() + "\n");
            }
        }
    }

    public static void mediaAltura(Pessoas[] vetor){
        double soma = 0;
        for (Pessoas ind : vetor ){
            soma += ind.getAltura();
        }
        double mediaAltura = soma/vetor.length; 
        System.out.printf("%nAltura média: %.2f%n", mediaAltura);
    }
}
