package org.example.form;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class Forms {

    @Id
    private String _id;
    private String title;
    private String name;
    private String path;
    private String type;
    private List<String> tags;
    private List<SubmissionAccess> submissionAccess;
    private String owner;
    private String display;
    private List<Map> components;
    private String machineName;
    private LocalDateTime created;
    private LocalDateTime modified;
    private int __v;
}
