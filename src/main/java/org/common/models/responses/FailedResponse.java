package org.common.models.responses;

import lombok.Getter;
import org.common.models.types.Response;

import java.net.HttpURLConnection;

@Getter
public class FailedResponse extends Response {
    private final String cause;

    public FailedResponse(final Integer status, final String message, final String cause) {
        super(status, message);
        this.cause = cause;
    }

    public FailedResponse(final String message, final String cause) {
        this(HttpURLConnection.HTTP_BAD_REQUEST, message, cause);
    }
}
