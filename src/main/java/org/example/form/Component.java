package org.example.form;

import lombok.*;

@Getter
@Setter
public class Component {

    private String type;
    private boolean persistent;
    private boolean unique;
    private boolean isProtected;
    private String defaultValue;
    private String suffix;
    private String prefix;
    private String placeholder;
    private String key;
    private String label;
    private String inputType;
    private boolean tableView;
    private boolean input;
}
