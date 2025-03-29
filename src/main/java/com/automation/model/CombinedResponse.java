package com.automation.model;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CombinedResponse {

    private Object httpResponse;
    private String extentReportContent;

    public CombinedResponse(Object httpResponse, String extentReportContent) {
//        this.httpResponse = httpResponse;
        this.extentReportContent = extentReportContent;
    }

    public Object getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(Object httpResponse) {
        this.httpResponse = httpResponse;
    }

    public String getExtentReportContent() {
        return extentReportContent;
    }

    public void setExtentReportContent(String extentReportContent) {
        this.extentReportContent = extentReportContent;
    }
}
