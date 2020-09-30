package com.company;

public class Weapon {
    private String typeofWeapon;
    private String nameofWeapon;

    public String getTypeofWeapon(){
        return  typeofWeapon;}
    public String getNameofWeapon(){
        return nameofWeapon;
    }
    public Weapon(String typeofWeapon, String nameofWeapon){
        this.typeofWeapon= typeofWeapon;
        this.nameofWeapon= nameofWeapon;
    }
}