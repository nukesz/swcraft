package org.swcraft.javaee.beans.ejb.name;

import javax.ejb.Stateless;

@Stateless(name = "FirstBean")
public class FirstBean implements LocalInterface {

    @Override
    public String getMessage() {
        return "I'm the first one!";
    }

}
