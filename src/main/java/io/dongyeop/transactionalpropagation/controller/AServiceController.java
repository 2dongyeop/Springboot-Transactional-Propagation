package io.dongyeop.transactionalpropagation.controller;

import io.dongyeop.transactionalpropagation.service.AService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AServiceController {

    private final AService aService;

    @GetMapping("/hello")
    public void start() {
        aService.save();
    }
}
