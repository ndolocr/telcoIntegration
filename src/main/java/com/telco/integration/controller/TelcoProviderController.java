package com.telco.integration.controller;

import com.telco.integration.dto.CreateTelcoProviderRequest;
import com.telco.integration.entity.TelcoProvider;
import com.telco.integration.service.TelcoProviderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/providers")
public class TelcoProviderController {
    TelcoProviderService service;

    public TelcoProviderController(TelcoProviderService service){
        this.service = service;
    }

    @PostMapping
    public TelcoProvider createTelcoProvider(@RequestBody CreateTelcoProviderRequest request){
        return service.createProvider(request);
    }
}
