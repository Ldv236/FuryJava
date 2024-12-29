package ru.ldv236.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // прописываем зависимости в пом хмл - slf5j и logback
        // добавляем конфиг логбэка - например, логгеры в консоль и в файл
        log.trace("This is a TRACE message");
        log.debug("This is a DEBUG message");
        log.info("This is an INFO message");
        log.warn("This is a WARN message");
        log.error("This is an ERROR message");

        doSomething();
    }

    public static void doSomething() {
        try {
            // какой-то код с исключением
            throw new ProductNotFoundException(1);
        } catch (ProductNotFoundException e) {
            log.warn(e.getMessage());
        }
    }
}
