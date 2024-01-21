package com.mohamed_azar.FizzbuzzRestApi.controller;

import com.mohamed_azar.FizzbuzzRestApi.model.FizzBuzz;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class Index {

    @RequestMapping(value = "/process/multiple1/{multiple1}/multiple2/{multiple2}/limit/{limit}/firstWord/{firstWord}/secondWord/{secondWord}", method = RequestMethod.GET)
    @ResponseBody
    public String getResult(
            @PathVariable("multiple1") int multiple1,
            @PathVariable("multiple2") int multiple2,
            @PathVariable("limit") int limit,
            @PathVariable("firstWord") String firstWord,
            @PathVariable("secondWord") String secondWord
    ) throws Exception
    {
        FizzBuzz fizzBuzz = new FizzBuzz(multiple1, multiple2, limit, firstWord, secondWord);
        return fizzBuzz.getResult();
    }
}
