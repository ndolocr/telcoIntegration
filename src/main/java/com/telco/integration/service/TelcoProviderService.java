package com.telco.integration.service;

import com.telco.integration.dto.CreateTelcoProviderRequest;
import com.telco.integration.entity.TelcoProvider;
import com.telco.integration.repository.TelcoProviderRepository;
import org.springframework.stereotype.Service;

@Service
public class TelcoProviderService {
    private final TelcoProviderRepository repository;

    public TelcoProviderService(TelcoProviderRepository repository){
        this.repository = repository;
    }

    public TelcoProvider createProvider(CreateTelcoProviderRequest request){
//        if(repository.existsByProviderCode(providerCode)){
//            throw new IllegalArgumentException("Provider code already exists.");
//        }
        TelcoProvider provider = new TelcoProvider();
        provider.setActive(false);
        provider.setProviderCode(request.getProviderCode());
        provider.setProviderName(request.getProviderName());

        return repository.save(provider);
    }

}
