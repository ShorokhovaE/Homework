package lesson7;

public class Lesson7 {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Снежок"),
                new Cat("Бусинка"),
                new Cat("Ушастик"),
                new Cat("Кекс")
        };

        Plate plate = new Plate(17);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
            System.out.println();
        }

        plate.addFoodToPlate(12);
        plate.info();


    }


}
