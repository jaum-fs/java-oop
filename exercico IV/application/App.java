package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serão digitadas: ");
        int qtdPessoas = sc.nextInt();

        Pessoas[] dados = new Pessoas[qtdPessoas];

        for (int i = 0 ; i< dados.length; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa%n", (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura =sc.nextDouble();
    

            dados[i]= new Pessoas(nome, altura, idade);
        }

        Pessoas.mediaAltura(dados);
        Pessoas.mediaPorcentagemMenores(dados);
        
        sc.close();

    }

}
