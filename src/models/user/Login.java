package models.user;

import java.io.Serializable;
import java.util.ArrayList;

public class Login implements Serializable {
    private String user;
    private String password;
    private final ArrayList<Login> logins = new ArrayList<>();


    public Login() {
        logins.add(new Login("admin","1"));
        logins.add(new Login("hieu","1"));
        logins.add(new Login("vinh","1"));
        logins.add(new Login("tuan","1"));

    }

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
