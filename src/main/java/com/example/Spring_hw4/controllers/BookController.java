package com.example.Spring_hw4.controllers;

import com.example.Spring_hw4.models.Tellbook;
import com.example.Spring_hw4.servis.TellbookServis;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Spring_hw4.models.Tellbook;
import com.example.Spring_hw4.servis.TellbookServis;

@Controller
@AllArgsConstructor
public class BookController {
    public final TellbookServis tellbookServis;

    @GetMapping("/tellbooks")
    public String getTellbookS(Model model) {
        model.addAttribute("tellbooks", tellbookServis.getAllTellbooks());
        return "tellbooks";
    }

    @PostMapping("/tellbooks")
    public String addTellbooks(Tellbook tellbook, Model model) {
        tellbookServis.addTellbook(tellbook);
        model.addAttribute("tellbooks", tellbookServis.getAllTellbooks());
        return "tellbooks";
    }

    @PostMapping ("/tellbooks/{id}")
    public String deleteByName(@PathVariable("id") Integer id, Model model) {
        tellbookServis.deleteById(id);
        model.addAttribute("tellbooks", tellbookServis.getAllTellbooks());
        return "/tellbooks";
    }
}
