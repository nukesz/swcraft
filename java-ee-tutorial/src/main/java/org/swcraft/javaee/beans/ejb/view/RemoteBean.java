package org.swcraft.javaee.beans.ejb.view;

import javax.ejb.Stateless;

@Stateless
public class RemoteBean implements ExampleRemote {

    @Override
    public String remoteMethod() {
        return "remote";
    }

}
