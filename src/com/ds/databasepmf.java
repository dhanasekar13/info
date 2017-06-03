package com.ds;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class databasepmf {
    private static final PersistenceManagerFactory pmfInstance =
        JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private databasepmf() {}

    public static PersistenceManagerFactory get() {
        return pmfInstance;
    }
}
