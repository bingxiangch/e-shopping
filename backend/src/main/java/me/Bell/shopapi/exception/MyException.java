package me.Bell.shopapi.exception;


import me.Bell.shopapi.enums.ResultEnum;

/**
 * Created By bingxiang on 3/10/2021.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
