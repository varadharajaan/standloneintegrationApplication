package com.springboot;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.time.Instant;

/**
 * @Author Varadharajan on 16/12/19 22:12
 * @Projectname spring-boot-integration-tests
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

    private HttpStatus status;

    private Instant timestamp = Instant.now();
    private String message;
    private long exceutionTime;

    public ApiResponse() {

    }

    public ApiResponse(String message) {
        this.message = message;
    }

    public ApiResponse(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;

    }

    public long getExceutionTime() {
        return exceutionTime;
    }

    public void setExceutionTime(long exceutionTime) {
        this.exceutionTime = exceutionTime;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }


    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
