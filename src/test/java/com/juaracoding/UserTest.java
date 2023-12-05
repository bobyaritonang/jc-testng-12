package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {
    User user;

    @BeforeMethod
    public void setUp(){
        user = new User();
    }
    @Test
    public void checkLogin(){
        user.setUsername("Boby");
        user.setPassword("Boby123");
        Assert.assertTrue(user.checkLogin());
    }

    @Test
    public void pesanErrorTest() {
        Assert.assertTrue(user.getPesanError().contains("Invalid"));
    }

}
