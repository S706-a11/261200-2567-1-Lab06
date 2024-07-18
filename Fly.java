
public class Fly extends Animal implements Flyable{
    
    void sound(){
        System.out.println("Fuzzzz");
    }
    @Override
    public void fly() {
        System.out.println("i believe i can fly");
    }

    @Override
    public void glide() {
        System.out.println("i can also ron el");
    }

    @Override
    public void land() {
        System.out.println("i can land on water");
    }
       
}





