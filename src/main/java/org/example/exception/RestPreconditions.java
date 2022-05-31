package org.example.exception;

public class RestPreconditions {
    public static <T> T checkFound(T resource) throws Exception {
        if (resource == null) {
            throw new Exception("");
        }
        return resource;
    }
}
