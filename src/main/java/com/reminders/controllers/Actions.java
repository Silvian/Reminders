package com.reminders.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by silvian on 21/06/15.
 */
@Controller
public class Actions {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String displayIndex(Model model) {

        return "redirect:pages/index.html";
    }

}
