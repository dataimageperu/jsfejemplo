/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataimage.m3_lab3.controllers.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"direction", "way", "pages"})
public class TestRedireccionamiento {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "test/direccion";
    }
}
