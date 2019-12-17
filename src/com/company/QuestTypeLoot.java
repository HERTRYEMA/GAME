package com.company;

import java.util.Scanner;

public class QuestTypeLoot {

    public String Name;
    public String Text;
    Scanner in = new Scanner(System.in);

    public QuestTypeLoot(String name, String text) {
        this.Name = name;
        this.Text = text;
    }

    public void PrintQuest() {
        System.out.println("==============" + " " + Name + " " + "==============");
        System.out.println("");
        System.out.println(Text);
    }

    public int Randomizer(int answer, int newtag) {

        if (answer == 1) {

            newtag = (int) (Math.random() * 10);
            System.out.println("Вы нашли: ");
            Main.hero.weapon.Visualisator(newtag);
            System.out.println("Экипировать?");
            System.out.println("[1] Да \n" + "[2] Нет \n");
            Main.hero.EquipWeapon(in.nextInt());
        }
        return newtag;

    }
}