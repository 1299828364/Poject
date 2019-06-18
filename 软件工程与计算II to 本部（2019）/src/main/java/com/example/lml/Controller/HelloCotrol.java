package com.example.lml.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloCotrol {

    @ResponseBody


    @GetMapping(value = "/hello")
    public String Hello(){
        return "Hello World";
    }


    @GetMapping("/index")
    public String index(){
        return "hello";
    }

    @GetMapping("Test")
    public String test(){
        return "test";
    }
}
