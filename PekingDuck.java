
public class PekingDuck extends Duck {
    void brCrispy() {
        System.out.println("grob grob");
    }

    @Override
    void clean(Animal cleanee) { 
        System.out.println("I died already, sorry.");
    }
}
