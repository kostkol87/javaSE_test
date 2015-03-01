package ru.test;

import org.apache.log4j.Logger;

/**
 * Created by Константин on 25.07.2014.
 */
public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.trace("");
        LOG.trace("Start");

        LOG.fatal("Fatal message");
        LOG.error("Error message");
        LOG.warn("Warning message");
        LOG.info("Info message");
        LOG.debug("Debug message");
        LOG.trace("Trace message");
        new Test().someMethod();
        new Test().anotherMethod();
    }

}
