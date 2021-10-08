package Animals;

import Animals.Animal;

public class Cat extends Animal {
    protected static int numberOfCats; // переменная для подсчета сазданных котов

    public Cat(String name) {
        this.name = name;
        this.numberOfCats++;
        this.numberOfAnimals++;
    }

    @Override
    public void run(int length){
        if (length <= 200){
            super.run(length);
        } else {
            System.out.println(name +" не сможет пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int length){
        System.out.println( name + " не умеет плавать.");
    }

}
