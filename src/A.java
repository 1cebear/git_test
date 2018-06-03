import java.util.concurrent.ThreadLocalRandom;

public class A {

    public static int value() {
        return func();
    }

    private static int func()
    {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }
}
