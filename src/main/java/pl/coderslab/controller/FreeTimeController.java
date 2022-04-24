package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Controller
public class FreeTimeController {

    @GetMapping("/day")
    @ResponseBody
    public String getDate(){
        LocalDateTime now = LocalDateTime.now();
       DayOfWeek today =  now.getDayOfWeek();
       int hour = now.getHour();

        if(today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY){
            return "Day Off";
        }else if (hour > 8 && hour < 18){
            return "I'm working!";
        }
        return "After work";
    }
}
