package com.automation.utils.ui.model;

public class ActionDetail {

    private String action;
    private String xpath;
    private String value;

    private String validateTitle;

    public ActionDetail() {
    }

    public ActionDetail(String action, String xpath, String value, String validateTitle) {
        this.action = action;
        this.xpath = xpath;
        this.value = value;
        this.validateTitle= validateTitle;
    }

    public String getValidateTitle() {
        return validateTitle;
    }

    public void setValidateTitle(String validateTitle) {
        this.validateTitle = validateTitle;
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
}
