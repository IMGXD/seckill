package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by Gumo on 2017/1/12.
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
