package org.example.form;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormsService {

    private final FormsRepository formsRepository;

    public FormsService(FormsRepository formsRepository) {
        this.formsRepository = formsRepository;
    }

    public List<Forms> findAll(){
        return formsRepository.findAll();
    }

    public Optional<Forms> findById(String id){
        return formsRepository.findById(id);
    }
}
