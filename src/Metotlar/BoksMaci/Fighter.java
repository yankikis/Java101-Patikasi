package Metotlar.BoksMaci;

import sun.util.resources.cldr.am.CalendarData_am_ET;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe ){
        //System.out.println("----------");
        System.out.println(this.name  + " " + this.damage + " hasar vurdu.");

        if(foe.dodge()){
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean dodge(){
        double randomValue = Math.random() *100; // 0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
