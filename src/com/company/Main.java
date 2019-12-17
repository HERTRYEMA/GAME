package com.company;

import java.util.Scanner;

public class Main {

    public static Character hero;
    public static Story story;

    public boolean TheEnd = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PicDrawer picture = new PicDrawer();
        CharInfo info = new CharInfo();

        String S;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~( 1 )~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");

        System.out.println("\n " +
                "Заснеженные просторы Сн’йобурна, что к северу от диких \n " +
                "земель Вилдланда, долгие годы оставались уголком мира \n " +
                "и равновесия на Восточном Континенте. Бескрайние \n " +
                "ледяные моря, хвойные леса и прекрасные огни северного \n " +
                "сияния, заставляющие даже самого равнодушного к чудесам \n " +
                "природы человека замереть на мгновение и подумать о \n " +
                " вечном, делали эти земли настоящим раем для путников, \n " +
                " стремящихся найти себя в этом большом мире, полном чудес \n " +
                "и загадок...");
        System.out.println("");

        picture.pic1();

        System.out.println(" [Введите любой символ чтобы продолжить...] ");
        System.out.print("Ввод: ");

        S = in.next();
        if (S != "") {

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~( 2 )~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");

            System.out.println("\n " +
                    "Казалось, нет конца прекрасным временам, но если бы \n " +
                    "все было в действительности так, то не рассказывал бы  \n " +
                    "я эту историю, не правда ли? Новоиспечённый хозяин этих \n " +
                    "земель, Лорд Ульфур, нанял вилдландских чародеев для \n " +
                    "проведения тайного магического ритуала, об истинном \n " +
                    "назначении которого, к слову, так никто до сих пор и не \n " +
                    "догадывается. Тёмная магия - страшная сила, управлять \n " +
                    "которой способны только самые опытные чернокнижники, \n " +
                    "но никак не лесные маги-самоучки из диких краёв. \n " +
                    "Снежные земли Сн’йобурна были осквернены, и с этого \n " +
                    "момента каждую ночь, с заходом солнца, на поверхность \n " +
                    "земли выбираются порождения тьмы и бессмысленно  \n " +
                    "бродят по округе, нападая на редких путников... \n ");
            System.out.println("");

            picture.pic2();
            System.out.println(" [Введите любой символ чтобы продолжить...] ");

            System.out.print("Ввод: ");

            S = in.next();
            if (S != "") {

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~( 3 )~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("");

                picture.pic3();

                System.out.print("\n " +
                        "Где-то в хвойном лесу, вдали от цивилизации, лежит на \n " +
                        "земле припорошённый снегом мужчина. Он хорошо тебе  \n " +
                        "знаком. Его имя:  ");

                hero = new Character(in.next());

                story = new Story();

                System.out.println("");

                System.out.println("Характеристики Вашего героя:");
                System.out.println("");
            }
        }

        hero.HP += story.current_situation.dHP;
        hero.AP += story.current_situation.dAP;

        System.out.println("[Здоровье: " + hero.HP + "]\n" + "[Сила атаки: "
                + hero.AP + "]\n");
        System.out.println("");

        System.out.println(" [Введите любой символ чтобы продолжить...] ");
        System.out.print("Ввод: ");
        S = in.next();
        if (S != "") {

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~( 4 )~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            System.out.println
                    (hero.name + " очнулся, встал на ноги и стряхнул снег со своей \n" +
                            "одежды. Где он? И как он здесь оказался? Хорошие вопросы,\n" +
                            "Но ответов на них наш герой не знал. Недалеко от него");
            if (hero.ClassSkillNum == 0) {
                System.out.println("на земле лежал большой и с виду очень прочный щит. Возможно,");
                System.out.println("герой бы его и не заметил в снегу, если бы не яркие блики");
                System.out.println("идеально отполированного металла. Сознание прояснилось.");
                System.out.println("Глядя на своё отражение в щите," + hero.name + " понял, что он -");
                System.out.println("член ордена щитоносцев.");
                System.out.println("");
                System.out.println("============== Класс героя ============== ");
                System.out.println(" [Класс: " + hero.CharClass + "]");
                System.out.println(" [Способность: " + hero.ClassSkillName + "]");
                System.out.println("========================================= ");
                System.out.println("");
                picture.picClass0();
            } else if (hero.ClassSkillNum == 1) {
                System.out.println("был воткнут в землю обломок гарпуна. " + hero.name + " взял его в руки, ");
                System.out.println("чтобы разглядеть поближе, и убедился, что сей инструмент действительно ");
                System.out.println("служит для охоты на Сн’йобурнских троллей, прячущихся на мелководье.");
                System.out.println("Гарпун идеально лежит в руке, хотя толку от него уже мало. Герой");
                System.out.println("понял, что он - охотник на троллей.");
                System.out.println("");
                System.out.println("============== Класс героя ============== ");
                System.out.println(" [Класс: " + hero.CharClass + "]");
                System.out.println(" [Способность: " + hero.ClassSkillName + "]");
                System.out.println("========================================= ");
                System.out.println("");
                picture.picClass1();
            } else if (hero.ClassSkillNum == 2) {
                System.out.println("лежала книга, украшенная со всех сторон светящимися руническими");
                System.out.println("символами. Большая часть страниц оказалась испорчена из-за долгого ");
                System.out.println("пребывания книги в снегу, но одна из них все-таки оказалась целой.");
                System.out.println("Внимательно прочитав, что там написано, " + hero.name + " убедился в том, что");
                System.out.println("это книга заклинаний магии Бездны. Сознание прояснилось. Герой понял,");
                System.out.println("что он - чернокнижник. ");
                System.out.println("");
                System.out.println("============== Класс героя ============== ");
                System.out.println(" [Класс: " + hero.CharClass + "]");
                System.out.println(" [Способность: " + hero.ClassSkillName + "]");
                System.out.println("========================================= ");
                System.out.println("");
                picture.picClass2();
            }

        }
        System.out.println(" [Введите любой символ чтобы продолжить...] ");
        System.out.print("Ввод: ");

        S = in.next();
        if (S != "") {
            QuestTypeLoot QTL1 = new QuestTypeLoot("5 Склеп", "Бредя по лесу в неизвестном направлении, " + hero.name + " натыкается на склеп.\n"
                    + "Внутри могут быть полезные вещи, но героя пугает неизвестность. Как\n" +
                    "поступить?\n" + "[1] Обыскать\n" + "[2] Пройти мимо\n");

            QTL1.PrintQuest();
            System.out.print("Ввод: ");
            QTL1.Randomizer(in.nextInt(), hero.NewWeapon);
            hero.weapon.Visualisator(hero.NewWeapon);

            info.printInfo();
        }
    }
}