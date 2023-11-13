package org.common.models.types;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public abstract class Response implements Serializable {
    protected Integer status;
    protected final String message;
}
