package com.example.demo.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.ResponseModel;

public class ResponseUtil {

    // 200 OK with data
    public static <T> ResponseEntity<ResponseModel<T>> successResponse(T data, String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.OK.value(), message, data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 201 Created with data
    public static <T> ResponseEntity<ResponseModel<T>> createdResponse(T data, String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.CREATED.value(), message, data);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // 204 No Content
    public static <T> ResponseEntity<ResponseModel<T>> noContentResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.NO_CONTENT.value(), "No Content", message);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    // 400 Bad Request
    public static <T> ResponseEntity<ResponseModel<T>> badRequestResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.BAD_REQUEST.value(), "Bad Request", message);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    // 401 Unauthorized
    public static <T> ResponseEntity<ResponseModel<T>> unauthorizedResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.UNAUTHORIZED.value(), "Unauthorized", message);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    // 404 Not Found
    public static <T> ResponseEntity<ResponseModel<T>> notFoundResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.NOT_FOUND.value(), "Not Found", message);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    // 409 Conflict
    public static <T> ResponseEntity<ResponseModel<T>> conflictResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.CONFLICT.value(), "Conflict", message);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    // 415 Conflict
    public static <T> ResponseEntity<ResponseModel<T>> unsupportedMediaTypeResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(),
                "Unsupported Media Type", message);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    // 500 Internal Server Error
    public static <T> ResponseEntity<ResponseModel<T>> serverErrorResponse(String message) {
        ResponseModel<T> response = new ResponseModel<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal Server Error", message);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
