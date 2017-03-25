
package model;

public class Usuario {
 String Login;
 String password;
 
 public Usuario(String Login, String password) {
        this.Login = Login;
        this.password = password;
    }
 
    public Usuario() {
    }
 

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
