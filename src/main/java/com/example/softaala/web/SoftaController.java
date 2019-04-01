package com.example.softaala.web;

import com.example.softaala.domain.Form;
import com.example.softaala.domain.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class SoftaController {


    @Autowired
    FormRepository formRepository;

    // RESTful all questions
    @RequestMapping(value = "/questions")
    public @ResponseBody
    List<Form> formListRest() {
        return (List<Form>) formRepository.findAll();
    }

    @RequestMapping(value = "/form/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Form> findQuestionRest(@PathVariable("id") Long formId) {
        return formRepository.findById(formId);
    }



    @RequestMapping("/index")
    public String index(Model model) {

        String hello = "Hello World controller";
        model.addAttribute("forms", formRepository.findAll());
        model.addAttribute("hello", hello);
        return "index";
    }

}
