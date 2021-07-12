package ru.gb.jca.l6.hw;

public class Animal {
    String name;
    int runLeng;
    int swimLeng;


    public Animal () {
    }

    public Animal (String name, int runLeng, int swimLeng){
    this.name = name;
    this.runLeng = runLeng;
    this.swimLeng = swimLeng;
    }

    public void swim (int swimRace){
        if( swimRace < swimLeng) {
            System.out.printf("%s swimed %d meters\n", name, swimRace);
        }
    }
    public void run (int runRace) {
        if(runRace < runLeng) {
            System.out.printf("%s run %d meters\n", name, runRace);
        }

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
