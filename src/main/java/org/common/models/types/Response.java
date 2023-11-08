package org.common.models.types;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Response {
    protected Integer status;
    protected final String message;
}
