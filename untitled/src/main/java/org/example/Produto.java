package org.example;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
        System.out.println(qtd + " unidades adicionadas. Estoque atual: " + this.quantidade);
    }

    public void vender(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println(qtd + " unidades vendidas. Estoque restante: " + this.quantidade);
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade inicial: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println("Produto cadastrado: " + produto);

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Mostrar produto");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Quantidade a adicionar: ");
                int qtd = scanner.nextInt();
                produto.adicionarEstoque(qtd);
            } else if (opcao == 2) {
                System.out.print("Quantidade a vender: ");
                int qtd = scanner.nextInt();
                produto.vender(qtd);
            } else if (opcao == 3) {
                System.out.println(produto);
            } else if (opcao == 4) {
                System.out.println("Encerrando programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
