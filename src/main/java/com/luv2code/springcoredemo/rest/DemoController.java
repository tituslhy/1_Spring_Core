package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    /**
     * Constructor injection. Recommended for non-optional dependencies
     * `Autowired` is optional if you only have one constructor
     * Use `@Qualifer` if there are too many `Coach` implementations
     * Specify the class name with the first alphabet in lower case
     * So the "BaseballCoach" should be "baseballCoach" when wrapped
     * in the `@Qualifier` annotation.
     * @param myCoach
     */
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

//    /**
//     * Setter injection. Recommended only for optional dependencies
//     * This method doesn't have to be a typical setter method
//     * It can be any name. Autowiring handles it
//     * @param theCoach
//     */
//    @Autowired
//    public void setCoach(@Qualifier("cricketCoach") Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
