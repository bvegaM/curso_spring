package com.example.spring.core.dependencyinyection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Profile("prod")
public class ProdEnviroment implements EnviromentService {
    @Override
    public Optional<String> getEnviroment() {
        return Optional.of("PROD");
    }
}
