package com.groupa.ssi.model.repository.storedprocedures.util;

/*
Created on 3/6/18
@author: HENRYBC
*/
public class SicknessProcedures implements GenericProcedureNames {

    public static final String ALL_NAME = "proGetAllSickness";
    public static final String READ_NAME = "proGetSickness";
    public static final String INSERT_NAME = "proInsertSickness";
    public static final String UPDATE_NAME = "proUpdateSickness";
    public static final String DELETE_NAME = "proDeleteSickness";

    public String allProcedureName() {
        return ALL_NAME;
    }

    public String readProcedureName() {
        return READ_NAME;
    }

    public String insertProcedureName() {
        return INSERT_NAME;
    }

    public String updateProcedureName() {
        return UPDATE_NAME;
    }

    public String deleteProcedureName() {
        return DELETE_NAME;
    }
}
