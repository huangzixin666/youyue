package com.youyue.utli;


/**
 * 返回前端的消息封装
 */
public class Result<T> {

    private int retCode;//0：成功  1：失败
    private String message;//返回消息
    private T data;


    private Result(T data) {
        this.retCode = 0;
        this.message = "成功";
        this.data = data;
    }
    private Result(Result cm) {
        if(cm == null){
            return;
        }
        this.retCode = cm.getRetCode();
        this.message = cm.getMessage();

    }
    /**
     * 成功时候的调用
     * @return
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }
    /**
     * 成功，不需要传入参数
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> Result<T> success(){
        return (Result<T>) success("");
    }
    /**
     * 失败时候的调用
     * @return
     */
    public static <T> Result<T> error(Result cm){
        return new Result<T>(cm);
    }
    /**
     * 失败时候的调用,扩展消息参数
     * @param cm
     * @param msg
     * @return
     */
    public static <T> Result<T> error(Result cm,String msg){
        cm.setMessage(cm.getMessage()+"--"+msg);
        return new Result<T>(cm);
    }

    /**
     * get set
     * @return
     */
    public T getData() {
        return data;
    }
    public String getMessage() {
        return message;
    }
    public int getRetCode() {
        return retCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public void setData(T data) {
        this.data = data;
    }
}
