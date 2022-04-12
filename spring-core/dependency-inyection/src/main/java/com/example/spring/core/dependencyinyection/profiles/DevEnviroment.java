package com.example.spring.core.dependencyinyection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Profile("dev")
//@Profile({"dev", "default"}) -> cuando se queire que se ejecute este perfil por defecto
public class DevEnviroment implements EnviromentService{
    @Override
    public Optional<String> getEnviroment() {
        return Optional.of("DEV");
    }
}
