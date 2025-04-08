package com.automation.utils.ui.model;

public class ActionDetail {

    private String action;
    private String xpath;
    private String value;

    private String validate;

    private String password;

    private String window;

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public ActionDetail() {
    }

    public ActionDetail(String action, String xpath, String value, String validate,
                        String password, String window) {
        this.action = action;
        this.xpath = xpath;
        this.value = value;
        this.validate= validate;
        this.password= password;
        this.window=window;

    }



    public String getValidateTitle() {
        return validate;
    }

    public void setValidateTitle(String validate) {
        this.validate = validate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String xpath) {
        this.xpath = xpath;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
