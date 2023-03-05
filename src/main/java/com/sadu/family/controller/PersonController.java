package com.sadu.family.controller;

import com.sadu.family.dto.PersonDataDto;
import com.sadu.family.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Slf4j
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public ModelAndView msg(){
        log.info("msg method is called");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }

//    @GetMapping("/img")
//    public ModelAndView img(){
//        log.info("msg method is called");
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("personData");
//        PersonDataDto responseData = personService.getPersonByName("sadvik");
//        mav.addObject("person",responseData);
//        mav.addObject("imgName",responseData.getImageName());
//        return mav;
//    }

    @GetMapping("/get-data")
    public ModelAndView getPersonByName(@RequestParam("searchValue") String name) {
        log.info("getPersonByName method is called");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("personData");
        PersonDataDto responseData = personService.getPersonByName(name);
        mav.addObject("person",responseData);
        mav.addObject("imgName",responseData.getImageName());
        return mav;

    }
}
