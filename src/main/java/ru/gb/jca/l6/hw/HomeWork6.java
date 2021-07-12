package ru.gb.jca.l6.hw;

public class HomeWork6 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Bobik", 500, 10),
                new Dog("Tuzik", 500, 10),
                new Cat("Barsik", 200, 0),
                new Cat("Murzik", 200, 0)
        };

            for (int i = 0; i < animals.length; i++) {
            animals[i].run(100);
            if(!(animals[i] instanceof Cat)) animals[i].swim(5);
       }
    }
}
