package org.example.form;

import lombok.Data;

import java.util.List;

@Data
public class SubmissionAccess {

    private String type;
    private List<String> roles;
}
