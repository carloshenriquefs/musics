package com.musics;

import com.musics.principal.Principal;
import com.musics.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicsApplication implements CommandLineRunner {
    @Autowired
    private ArtistaRepository artistaRepository;

    public static void main(String[] args) {
        SpringApplication.run(MusicsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(artistaRepository);
        principal.exibeMenu();
    }
}
