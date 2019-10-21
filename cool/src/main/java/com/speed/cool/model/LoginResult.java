package com.speed.cool.model;

/**
 * @author ：wj
 * @date ：Created in 2019/9/17 15:04
 * @description：${description}
 * @modified By：
 * @version: version
 */
public class LoginResult {
    private boolean isLogin = false;
    private String result;

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
