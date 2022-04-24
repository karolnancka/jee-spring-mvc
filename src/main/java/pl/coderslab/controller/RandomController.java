package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
@GetMapping("/show-random")
@ResponseBody
    public String showRandom(){

        int max = 100;
        int min = 1;

        Random randomNum = new Random();
        int randomNumber = min + randomNum.nextInt(max);
        System.out.println(randomNumber);
        return Integer.toString(randomNumber);
    }

}
