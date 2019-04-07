package com.example.softaala.web;

import com.example.softaala.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
public class SoftaController {


    @Autowired
    QuestionsRepository questionsRepository;

    @Autowired
    FormRepository formRepository;
    @Autowired
    AnswersRepository answersRepository;




    // RESTful all questions
    // @RequestMapping(value = "/questions")
    // public @ResponseBody
    //  List<Form> formListRest() {
    //  return (List<Form>) formRepository.findAll();
    //  }

    @RequestMapping(value = "/savejson")
    public String addJson(Model model){
    model.addAttribute("Answer", new Answers());



    return "savejson";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Answers answers){

      answersRepository.save(answers);



        return "redirect:index";
    }


    @RequestMapping(value = "/questions")
    public @ResponseBody
    List<Questions> questionRest() { return (List<Questions>) questionsRepository.findAll();
    }

    @RequestMapping(value = "/answers")
    public @ResponseBody
    List<Answers> answersRest() { return (List<Answers>) answersRepository.findAll();
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
    @CrossOrigin(origins = "https://softarest.herokuapp.com/savejson")
    @RequestMapping(value="/savejson",method=RequestMethod.POST)

    public  @ResponseBody void getAsnwers(@RequestBody Answers answer, HttpServletRequest request) {

         String answer1 = answer.getAnswers();
         answersRepository.save(answer);

        // your logic next

    }



}
