package csh.archive;

import java.io.Serializable;

/**
 * @author cshdev110
 * @version 1.0
 */

public class RegisterSerializable implements Serializable{
    private String name;
    private int account;

    public RegisterSerializable() {
        this("", 0);
    }

    public RegisterSerializable(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public int getAccount() {
        return this.account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
