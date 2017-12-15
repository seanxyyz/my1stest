package com.service.qiao2thpro.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T07:07:53.833Z")

@RestSchema(schemaId = "qiao2thpro")
@RequestMapping(path = "/qiao2thpro", produces = MediaType.APPLICATION_JSON)
public class Qiao2thproImpl {

    @Autowired
    private Qiao2thproDelegate userQiao2thproDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userQiao2thproDelegate.helloworld(name);
    }

}
