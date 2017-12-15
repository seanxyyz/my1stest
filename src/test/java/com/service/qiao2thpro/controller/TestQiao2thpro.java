package com.service.qiao2thpro.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestQiao2thpro {

        Qiao2thproDelegate qiao2thproDelegate = new Qiao2thproDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = qiao2thproDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}