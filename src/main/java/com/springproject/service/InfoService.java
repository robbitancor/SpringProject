package com.springproject.service;

import com.springproject.dao.InfoRepository;
import com.springproject.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InfoService {
    @Autowired
    private InfoRepository infoRepository;

    public void saveInfo(){
        Info info = new Info();
        info.setName("rob");
        info.setAge(28);
        infoRepository.save(info);
    }


}
