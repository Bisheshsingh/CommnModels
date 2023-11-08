package org.common.models.responses;

import org.common.models.types.Response;

import java.net.HttpURLConnection;

public class ErroredResponse extends Response {
    private final Exception exception;

    public ErroredResponse(final Integer status, final String message, final Exception exception) {
        super(status, message);
        this.exception = exception;
    }

    public ErroredResponse(final String message, final Exception exception) {
        this(HttpURLConnection.HTTP_INTERNAL_ERROR, message, exception);
    }
}
