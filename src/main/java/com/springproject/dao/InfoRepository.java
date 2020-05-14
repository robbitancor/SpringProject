package com.springproject.dao;

import com.springproject.pojo.Info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface InfoRepository extends CrudRepository<Info, Long> {

}
