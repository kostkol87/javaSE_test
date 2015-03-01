package ru.test;

import org.apache.log4j.Logger;

/**
 * Created by Константин on 25.07.2014.
 */
public class Test {
    private static final Logger LOG = Logger.getLogger(Test.class);
    public void someMethod(){
        LOG.trace("=====================");
        LOG.trace("Test.class was created");
        LOG.trace("=====================");

    }
    public void anotherMethod(){
        LOG.trace("=====================");
        LOG.error("no Error in anotherMethod");
        LOG.trace("=====================");
    }
}
