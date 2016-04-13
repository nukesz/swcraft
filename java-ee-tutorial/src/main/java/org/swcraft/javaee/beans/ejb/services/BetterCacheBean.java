package org.swcraft.javaee.beans.ejb.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER) // Default
@Singleton
public class BetterCacheBean {

    private List<String> data = new ArrayList<>();

    @Lock(LockType.WRITE)
    public void add(String value) {
        data.add(value);
    }

    @Lock(LockType.READ)
    public List<String> getData() {
        return data;
    }
}
