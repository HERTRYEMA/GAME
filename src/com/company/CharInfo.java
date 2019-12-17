package com.company;

public class CharInfo {

    void printInfo() {

        System.out.println("============== Информация о герое ==============");
        System.out.println("Класс: " + Main.hero.CharClass);
        System.out.println("Здоровье: " + Main.hero.HP);
        System.out.println("Сила атаки: " + Main.hero.AP + " (+" + Main.hero.WeaponTag+")");
        System.out.print("Оружие: "); Main.hero.weapon.Visualisator(Main.hero.WeaponTag);  System.out.println("");
        System.out.println("Броня: " );
        System.out.println("Способность: " + Main.hero.ClassSkillName);
        System.out.println("================================================");
    }
}