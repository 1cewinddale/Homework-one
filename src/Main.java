import java.awt.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog =8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat +4;
        System.out.println(cat);
        var peper =763789;
        peper = peper + 4;
        System.out.println(peper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog =8.0;
        dog = dog -3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat -1.6;
        System.out.println(cat);
        var peper =763789;
        peper = peper -7639;
        System.out.println(peper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog =3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var TotalWeight = (fighter1 + fighter2);
        var WeightDifferent = (fighter2 - fighter1);
        System.out.println("Вес обоих бойцов составляет " + TotalWeight);
        System.out.println("Разница в весе двух бойцов составляет " + WeightDifferent);
    }
    public static void task7() {
        System.out.println("Задача 7");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var WeightDifferent = (fighter2 - fighter1);
        var WeightDifferent2 =(fighter2 % fighter1);
        System.out.println("разница в весе двух бойцов путём деления составляет " + WeightDifferent2);
        System.out.println("разница в весе двух бойцов путём вычитания составляет " + WeightDifferent);
    }
    public static void task8() {
        System.out.println("Задача 8");
        var NumberOfHour = (640);
        var WorkingDay = 8;
        var NumberOfEmployees = (NumberOfHour / WorkingDay);
        var IncreasesNumberOfEmployees = 94;
        var TotalNumberOfEmployees = (NumberOfEmployees + IncreasesNumberOfEmployees);
        var RemainingWorkingHours = (NumberOfHour % TotalNumberOfEmployees);
        System.out.println("Всего работников в компании —  "+ NumberOfEmployees);
        System.out.println("Если в компании работает " + TotalNumberOfEmployees +  " человека" + " то" + " всего " + RemainingWorkingHours + " часов работы может быть поделено между ними");
    }

}
