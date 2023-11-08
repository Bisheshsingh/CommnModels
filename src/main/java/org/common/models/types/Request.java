package org.common.models.types;

import lombok.Getter;

import java.security.SecureRandom;

@Getter
public abstract class Request {
    protected final String id;

    protected Request() {
        this.id = String.valueOf(new SecureRandom().longs());
    }
}
