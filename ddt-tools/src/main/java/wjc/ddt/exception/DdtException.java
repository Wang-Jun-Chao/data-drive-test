package wjc.ddt.exception;

/**
 * Author: 王俊超
 * Date: 2018-01-13 12:03
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class DdtException extends RuntimeException{

    public DdtException() {
    }

    public DdtException(String message) {
        super(message);
    }

    public DdtException(String message, Throwable cause) {
        super(message, cause);
    }

    public DdtException(Throwable cause) {
        super(cause);
    }

    public DdtException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
