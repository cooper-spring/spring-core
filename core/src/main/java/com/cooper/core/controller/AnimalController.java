package com.cooper.core.controller;

import com.cooper.core.bean.animal.NoisyAnimal;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final NoisyAnimal elephant;

    private final NoisyAnimal panda;

    @GetMapping("/elephant")
    public String elephant() {
        return elephant.scream();
    }

    @GetMapping("/panda")
    public String panda() {
        return panda.scream();
    }

}
