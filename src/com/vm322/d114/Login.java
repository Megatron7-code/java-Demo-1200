package com.vm322.d114;

import java.io.*;

public class Login implements Serializable {
    private static final long seriaVersionUID = 181123321123123L;
    private String username;
    private transient String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("username: " + username + "\n");
        sbuilder.append("password: " + password + "\n");
        return sbuilder.toString();
    }

    @Override
    public Login clone(){
        Login login = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try {
            ObjectInputStream ois = new ObjectInputStream(bais);
            login = (Login)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return login;
    }

    public static long getSeriaVersionUID() {
        return seriaVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
