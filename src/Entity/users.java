/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ruth9
 */
public class users {
    
    private int idUser;
    private String loginUser; 
    private String pwdUser;
    
    public users (int unId, String unLogin, String unPwd)
    {
        idUser= unId;
        loginUser= unLogin;
        pwdUser = unPwd;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the loginUser
     */
    public String getLoginUser() {
        return loginUser;
    }

    /**
     * @param loginUser the loginUser to set
     */
    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    /**
     * @return the pwdUser
     */
    public String getPwdUser() {
        return pwdUser;
    }

    /**
     * @param pwdUser the pwdUser to set
     */
    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }
    

    
}
