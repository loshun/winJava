package diamond;

public class Bird implements Speakable, Flyable {

    @Override
    public void doSpeak() {
        System.out.println("tweet tweet tweet");
    }

    @Override
    public void doFly() {
        System.out.println("This animal flew");
    }
}
