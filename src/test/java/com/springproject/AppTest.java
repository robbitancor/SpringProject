package com.springproject;

import com.springproject.config.AppConfig;
import com.springproject.pojo.Person;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class AppTest extends TestCase
{
    @Autowired
    private Person person;

    @Test
    public void test(){
        Assert.assertNotNull(person);
    }

}
