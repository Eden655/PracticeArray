package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount Eden = new BankAccount("Schuenemann", "IT939393939802753", 1.65);
        BankAccount Gabriella = new BankAccount("Schwarztwald", "IT567672567", 500.00);
        BankAccount Irene = new BankAccount("Cirulli", "IT567689646", 20000.00);
        BankAccount Philza = new BankAccount("Vignia", "IT56745468", 5.00);
        BankAccount Anais = new BankAccount("Malekzade", "IT567832567", 4539840480.00);


        accounts.add(Eden);
        accounts.add(Gabriella);
        accounts.add(Irene);
        accounts.add(Philza);
        accounts.add(Anais);


        double sum = 0.0;

        for(BankAccount b : accounts) {
            sum = sum + b.getBalance();
        }

        System.out.println("The total balance is:" + sum);

       /* list.add(2,99);
        for(Integer a : list) {
            System.out.print(a + " ");
        }
        System.out.println();

        list.set(2,99);
        for(Integer a : list) {
            System.out.print(a + " ");
        }
        System.out.println();

        list.remove(2);
        for(Integer a : list) {
            System.out.print(a + " ");
        }*/

    }
}


