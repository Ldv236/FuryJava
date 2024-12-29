package ru.ldv236.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductNotFoundException extends RuntimeException {

//    private static final Logger log = LoggerFactory.getLogger(ProductNotFoundException.class);
    private static final String MESSAGE = "Product not found (id - %d)";

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(int id) {
        super(String.format(MESSAGE, id));
//        log.warn(String.format(MESSAGE, id));
    }
}
