package controller.user;

import models.user.Login;
import storage.ReadWriteFile;

import java.util.ArrayList;

public class ManageLogin {
    private final ArrayList<Login> loginList = new ArrayList<>();
    private final ReadWriteFile<Login> loginReadWriteFile = new ReadWriteFile<>();
    private final String PATHNAME_OF_USER = "data/login.txt";

    public ManageLogin() {
    }

    public ArrayList<Login> getLoginList() {
        return loginReadWriteFile.readFileData(PATHNAME_OF_USER);
    }

    public void setListUser(String user, String password) {
        ArrayList<Login> logins;
        if (checkFile()) {
            logins = loginList;
        } else {
            logins = getLoginList();
        }
        logins.add(new Login(user, password));
        loginReadWriteFile.WriteFileData(logins, PATHNAME_OF_USER);
    }

    public boolean checkFile() {
        ArrayList<Login> loginList = getLoginList();
        return loginList == null;
    }
}
