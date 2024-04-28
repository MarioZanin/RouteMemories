package com.fatec.routememories.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam String deceasedName, @RequestParam String cemeteryName, @RequestParam(required = false) String dateOfDeath, Model model) {
        // Implemente a lógica para a pesquisa
        // Adicione os resultados ao modelo
        return "search_result";
    }
}
