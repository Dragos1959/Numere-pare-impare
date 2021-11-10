package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in)
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int user_input_number = input.nextInt();
        System.out.println(user_input_number);
        int a = user_input_number;
        System.out.println(a);
        if (a % 2 == 0) {
            System.out.println(+a+"  Este numar par");
        }
        if (a % 2 != 0) {
            System.out.println(+a + "  Este numar impar");
        }
    }
}

