package com.sparta.hh99blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> methodValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        ErrorResponse errorResponse = makeErrorResponse(e.getBindingResult());
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    private ErrorResponse makeErrorResponse(BindingResult bindingResult) {
        String description = "error";
        String detail = "";

        if (bindingResult.hasErrors()) {
            detail = bindingResult.getFieldError().getDefaultMessage();
            String bindResultCode = bindingResult.getFieldError().getCode();

            if (Objects.equals(bindResultCode, "NotEmpty")) {
                description = ErrorCode.NOT_EMPTY.getDescription();
            }
        }

        return new ErrorResponse(description, detail);
    }
}
