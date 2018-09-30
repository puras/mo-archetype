package me.puras.mo.archetype.error;

public class BusiException extends Exception {
    private int errCode;
    private String errDesc;

    public BusiException() {
    }

    public BusiException(int errCode, String errDesc) {
        super(errDesc);
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public BusiException(ErrCode errCode) {
        this(errCode.getCode(), errCode.getDesc());
    }

    public BusiException(String message) {
        super(message);
    }

    public BusiException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusiException(Throwable cause) {
        super(cause);
    }

    public BusiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrDesc() {
        return this.errDesc;
    }
}