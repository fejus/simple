package com.ssm.controller;

import com.ssm.entity.People;
import com.ssm.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @ResponseBody
    @RequestMapping(value = "/getList")
    public List<People> getPeopleList() {
        return peopleService.getPeopleList();
    }

    @ResponseBody
    @RequestMapping(value = "/getPeople/{id}")
    public People getPeople(@PathVariable int id) {
        return peopleService.getPeople(id);
    }
}
