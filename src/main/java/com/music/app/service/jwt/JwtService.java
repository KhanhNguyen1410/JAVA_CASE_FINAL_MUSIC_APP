package com.music.app.service.jwt;

import org.springframework.stereotype.Component;

@Component
public class JwtService {
    private static final String SECRET_KEY =  ("Avengers");
    private static final Long EXPIRE_TIME = 100000000L;
}
