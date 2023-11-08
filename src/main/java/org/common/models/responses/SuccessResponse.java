package org.common.models.responses;

import org.common.models.types.Response;

import java.net.HttpURLConnection;

public class SuccessResponse extends Response {
    public SuccessResponse(final String message) {
        super(HttpURLConnection.HTTP_ACCEPTED, message);
    }
}
