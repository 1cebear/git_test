import java.util.concurrent.ThreadLocalRandom;

public class B {

    public static int value(int rand1, int rand2) {
        return ThreadLocalRandom.current().nextInt(Math.min(rand1, rand2), Math.max(rand1, rand2) + 1);
    }
}
