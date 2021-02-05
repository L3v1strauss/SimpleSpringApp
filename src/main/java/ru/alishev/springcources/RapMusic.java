package ru.alishev.springcources;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RapMusic implements Music{

    public static RapMusic getRapMusic() {
        return new RapMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


    @Override
    public String getSong() {
        return "Mobb deep - Shoock ones pt.2";
    }
}
