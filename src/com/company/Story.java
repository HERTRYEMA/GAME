package com.company;

public class Story {

    private Situation story1_weapon;
    public Situation current_situation;

    Story() {
        story1_weapon = new Situation(
                "5 Находка",
                "Бредя по лесу в неизвестном направлении " + Main.hero.name + " натыкается на склеп.\n"
                        + "Внутри могут быть полезные вещи, но героя пугает неизвестность. Как \n"
                        + "поступить?\n"
                        + "[1] Обыскать\n"
                        + "[2] Пройти мимо\n"
                ,
                2);
        story1_weapon.direction[0] = new Situation(
                "=== Обыск прошел успешно! ===",
                "Герой нашел в склепе: ", 0);

        story1_weapon.direction[1] = new Situation(
                "совещание, босс доволен",
                "Сегодня будет совещание, меня неожиданно вызвали,"
                        + "есть сведения что \n босс доволен сегодняшней сделкой.",
                0);
        current_situation = story1_weapon;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}