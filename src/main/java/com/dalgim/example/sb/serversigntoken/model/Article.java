package com.dalgim.example.sb.serversigntoken.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Mateusz Dalgiewicz on 25.06.2017.
 */
@RequiredArgsConstructor
@Getter
public class Article {

    private final String content;
    private final String name;
}
