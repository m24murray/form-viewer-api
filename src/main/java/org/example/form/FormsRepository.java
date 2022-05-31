package org.example.form;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormsRepository extends MongoRepository<Forms, String> {

}
