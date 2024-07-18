public class Main {
    public static void main(String[] args) {
        
        Duck psyduck = new Duck();
        psyduck.sound();
        psyduck.pet();

        Owl rowlet = new Owl();
        rowlet.sound();
        rowlet.fly();
        rowlet.glide();
        rowlet.pet();
        rowlet.feed();
        rowlet.wombwomb();

        psyduck.clean(rowlet);
        PekingDuck dish = new PekingDuck();
        dish.brCrispy();
        dish.clean(rowlet);
    }
}