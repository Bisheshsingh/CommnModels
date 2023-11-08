package org.common.models.responses;

import org.common.models.types.Response;

import java.net.HttpURLConnection;

public class SuccessResponse extends Response {
    public SuccessResponse(final Integer status, final String message) {
        super(status, message);
    }

    public SuccessResponse(final String message) {
        this(HttpURLConnection.HTTP_ACCEPTED, message);
    }
}
