package org.common.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.common.models.types.Request;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public final class UpdateUserAuthDataRequest extends Request {
    private String userId;
    private String userFirstName;
    private String userLastName;
}
