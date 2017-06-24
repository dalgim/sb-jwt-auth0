package com.dalgim.example.sb.serversigntoken.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Mateusz Dalgiewicz on 25.06.2017.
 */
@Getter
@RequiredArgsConstructor
public class User {

    private final String login;
    private final String password;

}
