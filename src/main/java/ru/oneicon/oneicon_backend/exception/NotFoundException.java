package ru.oneicon.oneicon_backend.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String entity) {
        super(entity + " not found");
    }

}
