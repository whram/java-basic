package customException;

/*
* 自定义异常类
*   必须继承Exception或者RunTimeException
* */

public class RegisterException extends Exception {

    public RegisterException() {
    }

    public RegisterException(String message) {
        super();
    }

}
