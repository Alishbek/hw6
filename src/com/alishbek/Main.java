package com.alishbek;

public class Main {

    public static void main(String[] args) {
        Boss1 boss = new Boss1();
        boss.setHealth(1300);
        boss.setDamage(85);
        boss.setNameOfWeapon("AK-47");
        boss.setTypeOfWeapon("gun");
        System.out.println("Boss health: "+boss.getHealth()+"  ["+boss.getDamage()+"]");
        System.out.println("Boss weapon: "+boss.getNameOfWeapon()+"   type: "+boss.getTypeOfWeapon());
    }
}
