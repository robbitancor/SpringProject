package com.springproject.controllers;

import com.springproject.dao.InfoRepository;
import com.springproject.pojo.Info;
import com.springproject.pojo.Person;
import com.springproject.pojo.SimplePojo;
import com.springproject.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplePersonalController {

    @Autowired
    private InfoService infoService;

    @GetMapping(value = "/testing",produces = MediaType.APPLICATION_JSON_VALUE)
    public Person test(){
        infoService.saveInfo();
        return new Person();
    }

    @GetMapping(value = "/simplepojo",produces = MediaType.APPLICATION_JSON_VALUE)
    public SimplePojo simplePojo(){
        return new SimplePojo();
    }

}