package com.dalgim.example.sb.serversigntoken.controller;

import com.dalgim.example.sb.serversigntoken.model.Article;
import com.dalgim.example.sb.serversigntoken.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mateusz Dalgiewicz on 25.06.2017.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Article> getAll() {
        return articleService.getAll();
    }
}
