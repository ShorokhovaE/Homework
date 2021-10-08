package Animals;

import Animals.Animal;

public class Dog extends Animal {
    protected static int numberOfDogs; // переменная для подсчета созданных собак

    public Dog(String name){
        this.name = name;
        this.numberOfDogs++;
        this.numberOfAnimals++;
    }

    @Override
    public void run(int length){
        if(length <= 500){
            super.run(length);
        } else {
            System.out.println(name +" не сможет пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int length){
        if(length <= 10){
            super.swim(length);
        } else {
            System.out.println(name + " не сможет проплыть больше 10 м.");
        }
    }

    public int getNumberOfDogs(){
        return numberOfDogs;
    }
}
