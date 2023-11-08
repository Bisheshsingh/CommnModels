package org.common.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.common.models.types.Request;

@Builder
@Getter
@AllArgsConstructor
public final class ResetPasswordRequest extends Request {
    private final String userId;
    private final transient String password;
}
