package org.common.models.responses;

import lombok.Getter;
import org.common.models.types.ExceptionDetails;
import org.common.models.types.Response;

import java.net.HttpURLConnection;

@Getter
public class ErroredResponse extends Response {
    private final ExceptionDetails exceptionDetails;

    public ErroredResponse(final Integer status, final String message,
                           final ExceptionDetails exceptionDetails) {
        super(status, message);
        this.exceptionDetails = exceptionDetails;
    }

    public ErroredResponse(final String message, final ExceptionDetails exceptionDetails) {
        this(HttpURLConnection.HTTP_INTERNAL_ERROR, message, exceptionDetails);
    }

    public ErroredResponse(final Integer status, final String message,
                           final Exception exception) {
        this(status, message, ExceptionDetails.fromException(exception));
    }

    public ErroredResponse(final String message, final Exception exception) {
        this(HttpURLConnection.HTTP_INTERNAL_ERROR, message, exception);
    }
}
