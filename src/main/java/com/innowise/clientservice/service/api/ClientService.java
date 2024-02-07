package com.innowise.clientservice.service.api;

import com.innowise.clientservice.model.dto.request.ClientCreateDto;
import com.innowise.clientservice.model.dto.response.ClientDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {
    ClientDto getClientById(Long clientId);
    Page<ClientDto> getClients(Pageable pageable);
    ClientDto createClient(ClientCreateDto clientCreateDto);
    ClientDto updateClient(ClientCreateDto clientCreateDto);
    ClientDto deleteClient(Long clientId);
}
