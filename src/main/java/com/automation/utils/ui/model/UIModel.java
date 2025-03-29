package com.automation.utils.ui.model;

import java.util.List;
import java.util.Map;

public class UIModel {

    private String featureName;
    private List<ActionDetail> actions;
    private String browser;


    public UIModel() {
    }

    public UIModel(String featureName, String browser, List<ActionDetail> actions) {
        this.featureName = featureName;
        this.browser= browser;
        this.actions = actions;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public List<ActionDetail> getActions() {
        return actions;
    }

    public void setActions(List<ActionDetail> actions) {
        this.actions = actions;
    }
}
