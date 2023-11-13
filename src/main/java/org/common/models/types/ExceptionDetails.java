package org.common.models.types;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class ExceptionDetails {
    private final String clazzName;
    private final String message;
    private final List<String> stackTrace;

    public static ExceptionDetails fromException(final Exception exception) {
        return new ExceptionDetails(exception.getClass().getSimpleName(), exception.getMessage(),
                Arrays.stream(exception.getStackTrace())
                        .map(StackTraceElement::toString)
                        .collect(Collectors.toList()));
    }
}
