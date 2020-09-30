package com.company;
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(healthHB:200, damageHB:50);
        Weapon weapon = new Weapon( typeofWeapon:"pistolet",
                nameofWeapon: "Makarov");
        boss.setWeapon(weapon);
        System.out.println("BossHealt h= " + boss.get.HealthHB() +
                " " + "BossDamage = " + boss.get.DamageHB() +
                " " + "BossWeapon - " + boss.getWeapon().getnameofWeapon() +
                " " + boss.getWeapon().getTypeofWeapon());
    }
}
