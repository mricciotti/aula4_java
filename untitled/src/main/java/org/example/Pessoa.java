////package org.example;
////
////public class Pessoa {
////    //O método calcularMediaExame será responsável por realizar o cálculo da média do exame do aluno(a)
////    public double calcularMediaExame(double mediaSemestral, double notaExame){
////        double mediaExame = (mediaSemestral + notaExame) / 2;
////        return mediaExame;
////    }
////    //O método calcularNotaCorte será responsável para obter o valor minimo de nota para aprovação no exame
////    public double calcularNotaCorte(double mediaSemestral){
////        double notaCorte = (10 - mediaSemestral);
////        return notaCorte;
////    }
////    // O método calcularMediaSemestral será responsável por realizar o Cálculo de Média Semestral do Aluno(a)
////    public double calcularMediaSemestral(double nota1, double nota2, double notaTrabalho) {
////        double mediaSemestral = ((nota1 * 0.4) + (nota2 * 0.4) + (notaTrabalho * 0.2));
////        return mediaSemestral;
////    }
////}
//
//import org.example.Pessoa;
//
//public class Pessoa {
//    private String nome;
//    private int idade;
//
//    //Contstutor padrao (sem parametros)
//    public Pessoa(){
//        this.nome = "Sem nome";
//        this.idade = 0;
//    }
//    //Construtor com parametros
//    public Pessoa(String nome, int idade){
//        this.nome = nome;
//        this.idade = idade;
//    }
//}
//
////Usando os construtores
//
//Pessoa pessoa2 = new Pessoa("Joao", 25)