package com.jtt.returnJson;

import java.util.List;

public class Perminssions {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Perminssions{" +
                "permissions=" + permissions +
                '}';
    }
}
