package org.common.models.requests;

import lombok.Builder;
import lombok.Getter;
import org.common.models.types.Request;

@Builder
@Getter
public final class ResetPasswordRequest extends Request {
    private final String userId;
}
