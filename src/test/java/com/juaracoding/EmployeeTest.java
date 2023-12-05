package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeTest {
    Employe employe;

    @BeforeMethod
    public void setUp(){
        employe = new Employe();
    }

    @Test
    public void nameTest(){
        employe.setName("Boby");
        Assert.assertEquals(employe.getName(),"Boby");
    }

    @Test
    public void addressTest(){
        employe.setAddress("Sumatra");
        Assert.assertEquals(employe.getAddress(),"Sumatra");
    }

    @Test
    public void salaryTest() {
        employe.setSalary(1000000.0);
        Assert.assertEquals(employe.getSalary(), 1000000.0);
    }

}
