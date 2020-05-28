package com.iishoni.blogserver.web;

public interface Urls {

    public interface Admin {
        String ROOT = "/admin";
        String GET_ADMIN_LIST = "/list";
        String GET_ADMIN_BY_ID = "/{adminId}";
        String GET_ADMIN_BY_PROFILE = "";
        String SAVE_ADMIN = "";
        String UPDATE_ADMIN = "/{adminId}";
        String DELETE_ADMIN = "/{adminId}";
    }
}
