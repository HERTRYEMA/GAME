package com.company;

public class Character {

    public String name;
    public String CharClass;
    public String ClassSkillName;

    public int HP;
    public int AP;
    public int ClassSkillNum;

    public int WeaponTag;
    public int NewWeapon;
    public int ArmorTag;

    Weapon weapon = new Weapon();

    public Character(String name) {
        this.name = name;

        HP = (int) (Math.random() * 10);
        AP = 10 - HP;

        WeaponTag = 0;
        NewWeapon = 0;
        ArmorTag = 0;

        if (HP > AP) {
            CharClass = "Щитоносец";
            ClassSkillName = "Возможность блокировать весь урон от прямого удара противника щитом (подготовка 1 ход) ";
            ClassSkillNum = 0;
        } else if (HP == AP) {
            CharClass = "Охотник на троллей";
            ClassSkillName = "Повышенный шанс выпадения предметов с лучшими характеристиками";
            ClassSkillNum = 1;
        } else if (HP < AP) {
            CharClass = "Чернокнижник";
            ClassSkillName = "Возможность нанести мощный удар магией Бездны (подготовка 2 хода) ";
            ClassSkillNum = 2;
        }
    }

    public void EquipWeapon(int answer) {
        if (answer == 1) {
            WeaponTag = NewWeapon;
        }
    }

    public void setWeaponTag(int weaponTag) {
        WeaponTag = weaponTag;
    }
}
