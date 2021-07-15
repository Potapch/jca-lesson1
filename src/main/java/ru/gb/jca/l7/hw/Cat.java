package ru.gb.jca.l7.hw;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public boolean eat(Bowl bowl) {
        if (bowl.decreaseFoodFromBowl(appetite)) {
            System.out.printf("Cat %s ate for %d food\n", this.name, this.appetite);
            this.satiety = true;
            return false;
        }
            System.out.printf("Cat %s is hungry\n", this.name);
        return true;
    }



    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

   }