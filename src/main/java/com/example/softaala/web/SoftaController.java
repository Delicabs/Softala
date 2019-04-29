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
//moi moi

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswersRepository answersRepository;


    @Autowired
    ValueRepository valueRepository;


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
    @RequestMapping(value = "/questionss")
    public @ResponseBody
    List<Value> valueRest() {
        return (List<Value>) valueRepository.findAll();

    }


    @CrossOrigin
    @RequestMapping(value = "/answerss")
    public @ResponseBody
    List<Answer> answererRest() {
        return (List<Answer>) answersRepository.findAll();

    }


    @CrossOrigin
    @RequestMapping(value = "/question/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Question> findQuestionById(@PathVariable("id") Long questionId) {
        return questionRepository.findById(questionId);
    }


    @RequestMapping("/index")
    public String index(Model model) {

        String hello = "Hello World fucking rad controller";

        model.addAttribute("hello", hello);
        return "index";
    }

    @RequestMapping("/testi")
    public String testi(Model model) {


        return "testitesti";
    }

    // delete question

    // @Preauthorize("hasAuthority('ADMIN)")
    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String deleteQuestions(@PathVariable("id") Long questionId, Model model) {
        questionRepository.deleteById(questionId);
                return "redirect:../addquestion";
    }

    // Add new question
    @RequestMapping(value = "/addquestion")
    public String addQuestions(Model model) {
        model.addAttribute("questions", new Question());
        model.addAttribute("questions", questionRepository.findAll());
        return "addquestions";
    }

    // Edit existing question
    @RequestMapping(value = "/edit/{id}")
    public String editQuestions(@PathVariable("id") Long questionId, Model model) {
        model.addAttribute("questions", questionRepository.findById(questionId));
        model.addAttribute("questions", questionRepository.findAll());
        return "edit";
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
