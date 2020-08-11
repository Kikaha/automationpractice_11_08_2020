package pages;

import java.util.concurrent.ThreadLocalRandom;

public final class EmailGenerator {
    public static String Create() {
        return "someText" + ThreadLocalRandom.current().nextInt(0, 100)
                + "@" + "someText" + ThreadLocalRandom.current().nextInt(0, 100)
                + ".com";
    }
}
