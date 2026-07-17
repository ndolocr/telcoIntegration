package com.telco.integration.service;

import com.telco.integration.entity.TelcoProvider;
import com.telco.integration.repository.TelcoProviderRepository;
import org.springframework.stereotype.Service;

@Service
public class TelcoProviderService {
    private final TelcoProviderRepository repository;

    public TelcoProviderService(TelcoProviderRepository repository){
        this.repository = repository;
    }

    public TelcoProvider createProvider(String providerName, String providerCode, Boolean active){
//        if(repository.existsByProviderCode(providerCode)){
//            throw new IllegalArgumentException("Provider code already exists.");
//        }
        TelcoProvider provider = new TelcoProvider();
        provider.setActive(active);
        provider.setProviderCode(providerCode);
        provider.setProviderName(providerName);

        return repository.save(provider);
    }

}
