package com.springboot;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.maven.cli.MavenCli;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.time.Duration;
import java.time.Instant;


/**
 * @Author Varadharajan on 16/12/19 19:07
 * @Projectname spring-boot-integration-tests
 */
@RestController
public class TestController {

    @Scheduled(fixedRate = 30000)
    @GetMapping("/exceutetest")
    @ApiOperation(value = "create file metadata")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Request"), @ApiResponse(code = 200, message = "Request OK"), @ApiResponse(code = 500, message = "Server Error"),})
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<com.springboot.ApiResponse> exceuteTests() throws Exception {
        com.springboot.ApiResponse response = new com.springboot.ApiResponse();
        try {
            System.out.println(new File(".").getAbsolutePath());
            MavenCli cli = new MavenCli();
            response.setTimestamp(Instant.now());
            cli.doMain(new String[]{"clean", "install"}, ".", System.out, System.out);
            response.setStatus(HttpStatus.OK);
            response.setMessage("Successful");
            Duration duration = Duration.between(response.getTimestamp(), Instant.now());
            response.setExceutionTime(duration.toMillis());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            response.setMessage(e.getMessage());
            response.setStatus(HttpStatus.BAD_REQUEST);
            Duration duration = Duration.between(Instant.now(), response.getTimestamp());
            response.setExceutionTime(duration.getSeconds());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
