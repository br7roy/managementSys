/*
* Package com.rust.manage.common 
* FileName: CommonResponse
* Author:   fth
* Date:     2017/4/17 15:59
*/
package com.rust.manage.common;

import java.io.Serializable;

/**
 * FileName:    CommonResponse
 * Author:      Br7roy
 * Date:        2017/4/17
 * Description:
 */
public class CommonResponse<F> implements Serializable {

    private static final long serialVersionUID = 8963240991870062975L;


    private static final String ERROR_CODE = "9999";
    private static final String SUCCESS_CODE = "0000";


    private String responseMsg;

    private String responseCode;

    private F objData;

    public CommonResponse(String responseCode, String responseMsg, F objData) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        this.objData = objData;
    }


    /*success*/

    public CommonResponse() {
        responseCode = SUCCESS_CODE;
    }

    public CommonResponse(F objData) {
        this.responseCode = SUCCESS_CODE;
    }

    /*error*/
    public CommonResponse(String errorMsg) {
        this(errorMsg, ERROR_CODE, null);
    }


    public CommonResponse(String errorMsg, F objData) {
        this(errorMsg, ERROR_CODE, objData);
    }

    /*both*/
    public CommonResponse(String respCode, String respMsg) {
        this.responseCode = respCode;
        this.responseMsg = respMsg;
    }

    public static String getErrorCode() {
        return ERROR_CODE;
    }

    public static String getSuccessCode() {
        return SUCCESS_CODE;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public F getObjData() {
        return objData;
    }

    public void setObjData(F objData) {
        this.objData = objData;
    }
}
