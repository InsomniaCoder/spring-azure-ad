package com.insomniacoder.azuread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    //belong to Users group in Azure AD
    // The group name that you specify for the @PreAuthorize("hasRole('')")
    // method must contain one of the groups that you specified in the azure.activedirectory.active-directory-groups field
    // of your application.properties file.
    @PreAuthorize("hasRole('Users')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
