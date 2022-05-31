package org.example.form;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/forms")
public class FormsController {

    private final FormsService formsService;

    public FormsController(FormsService formsService) {
        this.formsService = formsService;
    }

    @GetMapping
    public List<Forms> findAll() {
        return formsService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Forms> findAllById(@PathVariable("id") String id) {
        return formsService.findById(id);
    }

}
