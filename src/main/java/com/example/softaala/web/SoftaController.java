package com.example.softaala.web;

import com.example.softaala.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
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
    @CrossOrigin
    @RequestMapping(value = "/savejson")
    public String addJson(Model model) {
        model.addAttribute("Answer", new Answer());


        return "savejson";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Answer answer) {

        answersRepository.save(answer);


        return "redirect:index";
    }

    @CrossOrigin
    @RequestMapping(value = "/questions")
    public @ResponseBody
    List<Questions> questionRest() {
        return (List<Questions>) questionsRepository.findAll();
    }
    @CrossOrigin
    @RequestMapping(value = "/answers")
    public @ResponseBody
    List<Answer> answersRest() {
        return (List<Answer>) answersRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/question/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Questions> findQuestionById(@PathVariable("id") Long questionId) {
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


        return "testitesti";
    }

    /* @CrossOrigin
     @RequestMapping(value="/savejson",method=RequestMethod.POST)

     public  @ResponseBody void getAnswers(@RequestBody Answer answer, HttpServletRequest request) {

          String answer1 = answer.getAnswers();
          Answer ans1 = new Answer();
          ans1.setAnswers(answer1);
          answersRepository.save(ans1);

         // your logic next

     } */
    @CrossOrigin
    @RequestMapping(value = "/savejson", method = RequestMethod.POST,  consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String saveJson(@RequestBody Answer answer) throws ParseException, IOException {


                System.out.print(answer);
       answersRepository.save(answer);


       return "savejson";
    }

}
