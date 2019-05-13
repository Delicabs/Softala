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
import java.util.Map;
import java.util.Optional;

@Controller
public class SoftaController {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswersRepository answersRepository;

    @Autowired
    ValueRepository valueRepository;

    //To be continued...
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Question question) {
        questionRepository.save(question);
        return "redirect:index";
    }

    //JSON end-point for questions and answers
    @CrossOrigin
    @RequestMapping(value = "/questionss")
    public @ResponseBody
    List<Value> valueRest() {
        return (List<Value>) valueRepository.findAll();
    }

    //JSON for all answers
    @CrossOrigin
    @RequestMapping(value = "/answerss")
    public @ResponseBody
    List<Answer> answererRest() {
        return (List<Answer>) answersRepository.findAll();
    }

    //JSON search for question with id
    @CrossOrigin
    @RequestMapping(value = "/question/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Question> findQuestionById(@PathVariable("id") Long questionId) {
        return questionRepository.findById(questionId);
    }

    //Display all questions
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("questions", questionRepository.findAll());
        return "index";
    }

    //Delete question with id
    //Not working...
    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String deleteQuestions(@PathVariable("id") Long questionId, Model model) {
        questionRepository.deleteById(questionId);
                return "redirect:../addquestion";
    }

    // Add new question
    //Not working...
    @RequestMapping(value = "/add")
    public String addQuestions(Model model) {
        model.addAttribute("question", new Question());
        model.addAttribute("Value", valueRepository.findAll());
        return "add";
    }

    // Edit existing question
    //Not working...
    @RequestMapping(value = "/edit/{id}")
    public String editQuestions(@PathVariable("id") Long questionId, Model model) {
        model.addAttribute("question", questionRepository.findById(questionId));
        model.addAttribute("questions", questionRepository.findAll());
        model.addAttribute("Value", valueRepository.findAll());
        model.addAttribute("value", valueRepository.findById(questionId));
        return "edit";
    }

    //End-point for saving answers and mapping them to questions
    @CrossOrigin
    @RequestMapping(value="/savejson", method = RequestMethod.POST,  consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String saveJson(@RequestBody AnswerGenerator answerG) throws ParseException, IOException {
        System.out.print(answerG);
        Question question = questionRepository.findByQuestionid(answerG.getQuestionid());
        System.out.println(question);
        Answer answer = new Answer(answerG.getAnswer(), question);
        answersRepository.save(answer);
       return "savejson";
    }
}
