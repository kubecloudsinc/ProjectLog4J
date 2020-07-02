package com.apps;

import org.apache.log4j.Logger;

public class Log4jTest {

    private static final Logger LOG = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {

        LOG.debug("This is a test message");
        LOG.debug("Test msg from p9");
    }

}
