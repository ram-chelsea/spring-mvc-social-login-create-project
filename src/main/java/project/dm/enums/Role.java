package project.dm.enums;

public enum Role {
    ROLE_USER("user"), ROLE_ADMIN("admin");
    private String roleType;

    public String getRoleType() {
        return roleType;
    }

    Role(final String roleType) {
        this.roleType = roleType;
    }
}
