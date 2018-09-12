package io.github.kamaudan.BootifulWorld;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collection;
import java.util.Collections;

@RestController
public class ReservationRestController {


    private final ReservationRepository repository;

    public ReservationRestController(ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/reservations", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Collection<Reservation> reservations(){
        return this.repository.findAll();
    }


}
