package ru.alishev.springcources;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        Computer computer1 = context.getBean("computer", Computer.class);
        Computer computer2 = context.getBean("computer", Computer.class);
        boolean compare = computer1 == computer2;
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.playMusic());
        System.out.println(computer1);
        System.out.println(compare);
        context.close();

    }
}
