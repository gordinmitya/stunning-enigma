package com.example.demo;

import com.example.demo.moicode.Computer;
import com.example.demo.moicode.Table;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String helloWorld(Model model) {
      Table input = new Table();
      Table result = Computer.computeEverything(input);

      model.addAttribute("table", result);

      return "table";
    }

    @RequestMapping("/compute")
    public String goodBye() {
        return "table";
    }
}