package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Adding a "Primary" annotation means that this bean
 * gets surfaced as the primary bean if there is ambiguity.
 * Can only have one interface implementation annotated with "@Primary"
 * Note: @Primary is second in priority to @Qualifier annotations.
 * "@Qualifier" is the preferred approach
 * "@Lazy" means the bean is only initialized when it is needed
 */
@Component
@Primary
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("Track coach initialized");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
