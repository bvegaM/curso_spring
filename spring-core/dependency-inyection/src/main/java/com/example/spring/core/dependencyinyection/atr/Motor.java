package com.example.spring.core.dependencyinyection.atr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {


    private String marca;

    private Integer modelo;

    public Motor(@Value("ducati") String marca,@Value("1986") Integer modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
}