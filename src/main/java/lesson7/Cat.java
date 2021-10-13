package lesson7;

public class Cat {
   private String name;
   private int appetite;
   private boolean isHungry;
   private boolean isFull;

   public Cat(String name){
       this.name = name;
       this.appetite = 5;
       this.isHungry = true;
       this.isFull = false;
   }

   public String getName(){
       return name;
   }

   public int getAppetite(){
       return appetite;
   }

    public void info(){
        System.out.println("Name: " + name + ", hungry: " + isHungry + ", full: " + isFull);
    }

    public void eat(Plate plate){
       if(!plate.decreaseFood(appetite)) {
           System.out.println(name + " не поел. В миске недостаточно еды.");
           return;
       };
       isHungry = false;
       isFull = true;
       System.out.println(name + " поел из тарелки");
    }

}
