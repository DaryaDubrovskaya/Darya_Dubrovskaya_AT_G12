package classwork.day20;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LoggerClass {
    private static final Logger LOGGER = LogManager.getLogger(LoggerClass.class);

    public static void main(String[] args) {
        method1();
        method2();
    }

    @Test
    public static void method1() {
        LOGGER.info("I am from method 1");
    }

    @Test
    public static void method2() {
        LOGGER.warn("I am from method 2");
    }
}





