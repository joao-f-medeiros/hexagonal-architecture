package com.hexagonalarchitecture.domain;

class DomainException extends RuntimeException {

    DomainException(final String message) {
        super(message);
    }
}
