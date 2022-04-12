package com.example.spring.core.dependencyinyection.profiles;

import java.util.Optional;

public interface EnviromentService {

    public Optional<String> getEnviroment();
}
