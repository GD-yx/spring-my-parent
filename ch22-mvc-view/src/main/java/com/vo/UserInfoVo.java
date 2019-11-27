package com.vo;

/**
 * @author 南八
 */
public class UserInfoVo {
    private int id;
    private String username;

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public UserInfoVo(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserInfoVo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
