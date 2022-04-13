package com.example.spring.core.dependencyinyection.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") // cuando se utiliza este scopre y se instancian dos objetos, estos seran diferentes
@Scope("singleton") // cuando se utiliza este scopre y se instancian dos objetos, estos seran iguales, por defecto es singleton
public class EjemploScopeService {

}
