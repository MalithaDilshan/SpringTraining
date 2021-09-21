package com.company.controller;

import com.company.service.CalcService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    /**
     * Using the RequestParam annotation
     *
     * @param i RequestParam input t1
     * @param j RequestParam input t2
     * @return Model and View
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getAddition(@RequestParam("t1") int i, @RequestParam("t1") int j) {
        CalcService addService = new CalcService();
        int result = addService.addTwoIntNumbers(i, j);

        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("additionPage");
        modelView.addObject("result", result);
        return modelView;
    }
}
