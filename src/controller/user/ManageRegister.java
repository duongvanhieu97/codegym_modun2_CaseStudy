package controller.user;

import models.user.Register;
import storage.ReadWriteFile;

import java.util.ArrayList;

public class ManageRegister {
    private final ArrayList<Register> registers = new ArrayList<>();
    private final ReadWriteFile<Register> registerReadWriteFile = new ReadWriteFile<>();
    private final String PATHNAME_OF_REGISTER = "data/register.txt";

    public ManageRegister() {
    }
    public ArrayList<Register> getRegisterList() {
        return registerReadWriteFile.readFileData(PATHNAME_OF_REGISTER);
    }
    public void setRegisterList(int id, String name, String email, String phone, String address, String password) {
        ArrayList<Register> registers1 ;
        if (checkFile()) {
            registers1 = registers;
        }else {
            registers1 = getRegisterList();
        }
        registers1.add(new Register(id,name,email,phone,address,password));
        registerReadWriteFile.WriteFileData(registers1,PATHNAME_OF_REGISTER);
    }

    private boolean checkFile() {
        ArrayList<Register> registers = getRegisterList();
        return registers == null;
    }
}
