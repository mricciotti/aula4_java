package org.example;

import org.example.ContaBancaria;

public class Main{
    public static void main(String[] args){
        //Criando duas contas difrentes
        ContaBancaria conta1 = new ContaBancaria("Joao", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 2000.0);

        //Manipulando conta1
        conta1.depositar(500.0); //Saldo: 1500.0
        conta1.sacar(200.0); //Saldo: 1300.0

        //Manipulando conta2
        conta2.depositar(1000.0); //Saldo: 3000.0
        conta2.sacar(500.0);     //Saldo: 2500.0

    }
}