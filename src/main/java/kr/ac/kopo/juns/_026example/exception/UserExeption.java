package kr.ac.kopo.juns._026example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "찾을 수 없습니다.")
public class UserExeption extends RuntimeException{
    public UserExeption(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
