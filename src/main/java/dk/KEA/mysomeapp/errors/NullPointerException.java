package dk.KEA.mysomeapp.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus (value = HttpStatus.NO_CONTENT)
public class NullPointerException extends RuntimeException{

    public NullPointerException(String message) {
        super(message);
    }


}
