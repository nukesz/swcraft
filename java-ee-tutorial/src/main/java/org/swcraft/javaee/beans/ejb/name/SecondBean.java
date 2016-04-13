package org.swcraft.javaee.beans.ejb.name;

import javax.ejb.Stateless;

@Stateless(name = "SecondBean")
public class SecondBean implements LocalInterface {

    @Override
    public String getMessage() {
        return "I'm the second one!";
    }

}
