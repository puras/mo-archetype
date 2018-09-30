package me.puras.mo.archetype.error;

public enum ErrCode {

    DATA_NOT_FOUND_ERR(404, "访问的数据不存在"),

    DATA_BIND_ERR(9101, "数据绑定失败"),
    DATA_ALREADY_EXIST(9102, "数据体中字段内容重复"),
    REQ_PARAM_ERR(9103, "请求的参数不正确"),
    REMOTE_REQ_BODY_ERR(9201, "远程调用请求体不正确"),
    REMOTE_RES_BODY_ERR(9201, "远程调用响应体不正确"),
    HTTP_REQ_FAILURE(9998, "网络请求错误，错误内容为『%s』"),
    SYS_ERR(9999, "系统错误，请联系管理员");

    private int code;
    private String desc;

    ErrCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
