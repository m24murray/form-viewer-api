package org.example.customer;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;
}
