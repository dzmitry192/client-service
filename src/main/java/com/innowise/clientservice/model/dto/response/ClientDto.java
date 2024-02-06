package com.innowise.clientservice.model.dto.response;

import com.innowise.clientservice.model.enums.ClientRole;
import lombok.Builder;

import java.util.Set;

@Builder
public record ClientDto(
        Long id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        int drivingExp,
        Set<ClientRole> roles
) {
}
