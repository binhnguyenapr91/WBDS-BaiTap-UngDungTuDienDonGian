package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.DictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    public DictionaryService dictionaryService;
    @GetMapping("/dictionaryController")
    public ModelAndView search(@RequestParam String english){
        ModelAndView modelAndView = new ModelAndView("result");
        String result = dictionaryService.seachInVietnamese(english);
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
