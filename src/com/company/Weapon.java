package com.company;

public class Weapon {

    public void Visualisator(int APB) {

        if (APB == 1) {
            System.out.println("<%%%%|==========> " + "Заточка" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 2) {
            System.out.println("()==[:::::::::::::> " + "Ржавый клинок" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 3) {
            System.out.println("cxxx|;:;:;:;:;:;:;:;> " + "Волчий клык" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 4) {
            System.out.println("|O/////[{:;:;:;:;:;:;:;:;> " + "Орочий гнев" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 5) {
            System.out.println("▬▬ι═══════ﺤ -═══════ι▬▬ " + "Парные клинки" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 6) {
            System.out.println("cxxxxx][===============> " + "Цыганский шампур" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 7) {
            System.out.println("{}oo((X))ΞΞΞΞΞΞΞΞΞΞΞΞΞ> " + "Гладиаторский меч" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 8) {
            System.out.println(")xxxxx[;;;;;;;;;> " + "Гоблинский отравленный кинжал" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 9) {
            System.out.println("₪₪₪₪§|(Ξ≥≤≥≤≥≤ΞΞΞΞΞΞΞΞΞΞ> " + "Эльфийская нежность" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 10) {
            System.out.println("Ø)xxxxx[╣╗╗╕╕╕=======────── " + "Игла" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 11) {
            System.out.println("@()xxx[{:::\":::\":::\":::\":::\":::\":::=> " + "Тащи рулетку" + " ; [Бонус к силе атаки = " + APB + " ]");
        } else if (APB == 0) {
            System.out.println("Ничего");
        }
    }
}