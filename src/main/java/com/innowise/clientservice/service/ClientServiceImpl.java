package com.innowise.clientservice.service;

import com.innowise.clientservice.model.dto.request.ClientCreateDto;
import com.innowise.clientservice.model.dto.response.ClientDto;
import com.innowise.clientservice.repository.ClientRepository;
import com.innowise.clientservice.service.api.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public ClientDto getClientById(Long clientId) {
        return null;
    }

    @Override
    public Page<ClientDto> getClients(Pageable pageable) {
        return null;
    }

    @Override
    public ClientDto createClient(ClientCreateDto clientCreateDto) {
        return null;
    }

    @Override
    public ClientDto updateClient(ClientCreateDto clientCreateDto) {
        return null;
    }

    @Override
    public ClientDto deleteClient(Long clientId) {
        return null;
    }
}
