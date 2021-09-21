package com.company.controller;

import com.company.service.CalcService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SubController {

    /**
     * Using the HttpServletResponse and ttpServletResponse
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @return Model and View
     */
    @RequestMapping(value = "/sub", method = RequestMethod.GET)
    public ModelAndView getSubtract(HttpServletRequest request, HttpServletResponse response) {
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        CalcService addService = new CalcService();
        int result = addService.subTwoIntNumbers(i, j);

        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("subPage");
        modelView.addObject("result", result);
        return modelView;
    }
}
