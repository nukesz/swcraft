package org.swcraft.javaee.beans.ejb.services;

import javax.ejb.Stateful;

@Stateful
public class IncrementerServiceBean {

    private int startIndex = 0;

    public int getNext() {
        return ++startIndex;
    }

}
