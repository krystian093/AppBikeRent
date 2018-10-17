package model;

import javax.persistence.*;


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String userName;
    private String userlastName;
    private String email;
    private String password;

    public User(String userName, String userlastName, String email, String password) {
        this.userName = userName;
        this.userlastName = userlastName;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserlastName() {
        return userlastName;
    }

    public void setUserlastName(String userlastName) {
        this.userlastName = userlastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
