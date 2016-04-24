package org.swcraft.java8.streams.log;

public class Debugger {

    private static final CustomLogger LOG = new CustomLogger();

    public static void main(String[] args) {
        slowPrinter();
        guardPrinter();
        lambdaPrinter();
    }

    private static String expensiveMethod() {
        System.out.println("Called method");
        return "expensiveMethod";
    }

    private static void slowPrinter() {
        LOG.debug("Slow printer " + expensiveMethod());
    }

    private static void guardPrinter() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Guard printer " + expensiveMethod());
        }
    }

    private static void lambdaPrinter() {
        LOG.debug(() -> "Lambda printer " + expensiveMethod());
    }
}
