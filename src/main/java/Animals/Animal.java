package Animals;

public class Animal {
    protected String name;
    protected static int numberOfAnimals; // переменная для подсчета созданных животных

    public void run (int length){
        System.out.println(name + " пробежал " + length + " м.");
    }

    public void swim(int length){
        System.out.println(name + " проплыл " + length + " м.");
    }


}
