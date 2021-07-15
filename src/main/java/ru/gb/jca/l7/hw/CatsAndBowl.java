package ru.gb.jca.l7.hw;

public class CatsAndBowl {
    public static void main (String[] args) {


        Cat[] cats = {
               new Cat("Barsik", 20),
               new Cat("Murzik", 30),
               new Cat("Ryshik", 5),
               new Cat("Pushictik", 12),
               new Cat("Tolstopuz", 50)
       };


            Bowl bowl = new Bowl();
            bowl.putFoodIntoBowl(70);

            for (Cat cat: cats){
                if(cat.getAppetite()< bowl.getFood())
            cat.eat(bowl);
                else
                   System.out.printf("There is not enough food!");
    }

            System.out.println(bowl.getFood());
        }
}


