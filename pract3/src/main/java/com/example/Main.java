package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Введите число a ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите число b ");
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите число c ");
        c = sc.nextInt();
        sc.close();
        if((a+b<=c)||(b+c<=a)||(c+a<=b)){
            System.out.println("a, b и c не являются сторонами треугольника");
        }
        else if(a==b&&b==c&&c==a){
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }
        else if((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))||(Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2))||(Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2))){
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }
        else if((a==b||b==c||c==a)!=(a==b&&b==c&&c==a)){
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }
        else{
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
    }
}
