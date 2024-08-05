package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek",1000,40);
        Monster troll = new Troll("troll",500,50);

        System.out.println((shrek.getHitPoints()- troll.getDamage()));
    }
}
