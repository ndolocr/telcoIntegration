package com.telco.integration.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "telco_provider")
public class TelcoProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="provider_name", nullable = false, length = 100)
    private String providerName;

    @Column(name="provider_code", nullable = true, length = 20)
    private String providerCode;

    @Column(name="active")
    private Boolean active;

    public TelcoProvider() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
