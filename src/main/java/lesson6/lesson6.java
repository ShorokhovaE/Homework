package lesson6;

import Animals.*;

public class lesson6 {

    public static void main (String [] args) {

        Animal cat = new Cat("Персик");
        Animal cat1 = new Cat("Снежок");
        cat.run(300);
        cat1.run(150);

        Animal dog = new Dog("Бантик");
        dog.run(1000);

        cat.swim(2);
        dog.swim(8);




    }
}
