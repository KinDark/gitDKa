package sda.java6.simplejpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import sda.java6.simplejpa.repository.AlcoholRepository;


@Controller
public class AlcoholControler {
    private final AlcoholRepository alcoholRepository

            @Autowired
    public AlcoholControler(AlcoholRepository alcoholRepository) {
        this.alcoholRepository = alcoholRepository;
    }
    @GetMapping ("/alcohjol/form")
    public String showApp(){
        return "restalcostore";
    }

    @PostMapping("/alcohol")
   public String saveAlcohol(Alcohol alcohol){
        alcoholRepository.save(alcohol);
        return "resta;cpstpre";
    }
    @GetMapping("/alcohol")
    public @ResponseBody
    List<Alcohol> allAlcohole(){
        return alcoholRepository.findAll();

    }
}

