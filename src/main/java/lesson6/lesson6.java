package lesson6;

import Animals.*;

public class lesson6 {

    public static void main (String [] args) {

        Animal cat = new Cat("Персик");
        Animal cat1 = new Cat("Снежок");
        cat.run(300);

        Animal dog = new Dog("Бантик");
        dog.run(1000);

        Animal cat2 = new Cat("Пушок");



    }
}
