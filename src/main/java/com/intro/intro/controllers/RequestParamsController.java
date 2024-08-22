package com.intro.intro.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamsDTO foot(@RequestParam(required = false,   defaultValue = "Hola ...") String message){
        ParamsDTO param  = new ParamsDTO();
        param.setMessage(message);
        return param;
    }
}
