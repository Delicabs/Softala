package com.example.softaala.web;

import com.example.softaala.domain.Form;
import com.example.softaala.domain.FormRepository;
import com.example.softaala.domain.Questions;
import com.example.softaala.domain.QuestionsRepository;
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
    QuestionsRepository questionsRepository;

    @Autowired
    FormRepository formRepository;

    // RESTful all questions
    // @RequestMapping(value = "/questions")
   // public @ResponseBody
  //  List<Form> formListRest() {
      //  return (List<Form>) formRepository.findAll();
  //  }

    @RequestMapping(value = "/questions")
    public @ResponseBody
    List<Questions> questionRest() { return (List<Questions>) questionsRepository.findAll();
    }

    @RequestMapping(value = "/question/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Questions> findQuestinByID(@PathVariable("id") Long questionId) {
        return questionsRepository.findById(questionId);
    }



    @RequestMapping("/index")
    public String index(Model model) {

        String hello = "Hello World fucking rad controller";
        model.addAttribute("forms", formRepository.findAll());
        model.addAttribute("hello", hello);
        return "index";
    }


    @RequestMapping("/testi")
    public String testi(Model model) {
        Questions question = new Questions("JAva paska","");
      Form form = new Form("Paska perse");
      formRepository.save(form);
      questionsRepository.save(question);


        return "index";
    }


}
