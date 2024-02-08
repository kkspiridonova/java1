package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);//создание объекта класса Scanner и передаем ему стандартный поток ввода
            System.out.println("Введите координаты первой точки:");//Вывод строки
            System.out.println("Широта:");//Вывод строки
            double shir1 = in.nextDouble();//Считывание числа с клавиатуры
            shir1 = Math.toRadians(shir1);//перевод числа в радианы
            System.out.println("Долгота:");//Вывод строки
            double dol1 = in.nextDouble();//Считывание числа с клавиатуры
            dol1 =Math.toRadians(dol1);//перевод числа в радианы
            System.out.println("Введите координаты второй точки.");//Вывод строки
            System.out.println("Широта:");//Вывод строки
            double shir2 = in.nextDouble();//Считывание числа с клавиатуры
            shir2=Math.toRadians(shir2);//перевод числа в радианы
            System.out.println("Долгота:");//Вывод строки
            double dol2 = in.nextDouble();//Считывание числа с клавиатуры
            dol2 = Math.toRadians(dol2);//перевод числа в радианы
            final double Radius = 6378.1;//объявление константы
            double result = 2*Radius*Math.asin(Math.sqrt(Math.pow(Math.sin((shir2-shir1)/2),2) + Math.cos(shir1)*Math.cos(shir2)*Math.pow(Math.sin((dol2-dol1)/2),2)));
            System.out.println("Результат: " + result);//Вывод результата
        }
    }
}