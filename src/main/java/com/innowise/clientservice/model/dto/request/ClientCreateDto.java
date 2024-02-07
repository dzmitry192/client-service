package com.innowise.clientservice.model.dto.request;

import com.innowise.clientservice.model.enums.ClientRole;

import java.util.Set;

public record ClientCreateDto(
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        int drivingExp,
        Set<ClientRole> roles
) {
}
