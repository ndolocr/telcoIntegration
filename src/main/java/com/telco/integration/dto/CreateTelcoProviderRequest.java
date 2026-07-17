package com.telco.integration.dto;

public class CreateTelcoProviderRequest {
    private String providerName;
    private String providerCode;

    public CreateTelcoProviderRequest() {
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

}
