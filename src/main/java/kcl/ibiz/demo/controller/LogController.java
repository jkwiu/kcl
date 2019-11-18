package kcl.ibiz.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//https://github.com/link-nv/logback-s3-rolling-policy/blob/master/src/main/java/ch/qos/logback/core/rolling/aws/AmazonS3ClientImpl.java
@RestController("logs")
public class LogController {
    
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("trace")
    public String trace(){
        logger.trace("trace logs");

       return  "trace logs";
    }   

    @GetMapping("info")
    public String info(){
        logger.trace("info logs");

       return  "info logs";
    }
}