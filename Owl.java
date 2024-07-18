public class Owl extends Animal implements Flyable, Pettable {

    void sound() {
        System.out.println("hook hoot");
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
    
    @Override
    public void pet() {
        System.out.println("UwU!!");
    }

    @Override
    public void feed() {
        System.out.println("lap zap zap");
    }

    @Override
    public void wombwomb() {
        System.out.println("Womb Womb!");
    }


}
