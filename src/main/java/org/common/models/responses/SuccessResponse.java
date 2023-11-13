package org.common.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.common.models.types.Response;

import java.net.HttpURLConnection;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuccessResponse extends Response {
    private final Object returnedObject;

    public SuccessResponse(final Integer status, final String message, final Object object) {
        super(status, message);
        this.returnedObject = object;
    }

    public SuccessResponse(final Integer status, final String message) {
        this(status, message, null);
    }

    public SuccessResponse(final String message, final Object object) {
        this(HttpURLConnection.HTTP_ACCEPTED, message, object);
    }

    public SuccessResponse(final String message) {
        this(HttpURLConnection.HTTP_ACCEPTED, message, null);
    }
}
