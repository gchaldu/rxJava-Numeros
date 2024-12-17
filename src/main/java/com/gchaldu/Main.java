package com.gchaldu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RxJava principal = new RxJava();
        principal.viewListNumeros();
        Main.menu(principal);
    }

    public static void menu(RxJava principal){
        Scanner scanner = new Scanner(System.in);
        Integer op;
        Integer numero;
        do{
            System.out.println("Ingrese un numero");
            numero = scanner.nextInt();
            principal.addInteger(numero);
            System.out.println("Ingrese 1 si quiero salir");
            op = scanner.nextInt();
        }while(op!=1);
    }
}