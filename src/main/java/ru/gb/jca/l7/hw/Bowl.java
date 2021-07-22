package ru.gb.jca.l7.hw;

public class Bowl {
    private int food;

    public void putFoodIntoBowl(int amount) {
        this.food += amount;
        System.out.printf("Food increased for %d, now: %d\n", amount, this.food);
    }

    public boolean decreaseFoodFromBowl(int amount) {
        this.food -= amount;
        System.out.printf("Food decreased for %d, now: %d\n", amount, this.food);
        return true;
    }

    public int getFood() {
        return food;
    }
}
