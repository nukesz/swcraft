package org.swcraft.javaee.beans.ejb.view;

import javax.ejb.Remote;

@Remote
public interface ExampleRemote {

    String remoteMethod();

}
