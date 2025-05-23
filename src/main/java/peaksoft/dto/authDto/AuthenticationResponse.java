package peaksoft.dto.authDto;

import lombok.Builder;
import peaksoft.enums.Role;
@Builder

public record AuthenticationResponse(
        String token,
        String email,
        Role role
) {
}
