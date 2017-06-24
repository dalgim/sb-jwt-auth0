package com.dalgim.example.sb.serversigntoken.service;

import com.dalgim.example.sb.serversigntoken.model.Article;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Dalgiewicz on 25.06.2017.
 */
@Service
public class ArticleService {

    private List<Article> articles = new ArrayList<>();

    @PostConstruct
    public void initArticles() {
        articles.add(new Article("Example content", "First article"));
        articles.add(new Article("Example content", "Second article"));
    }

    public List<Article> getAll() {
        return articles;
    }
}
