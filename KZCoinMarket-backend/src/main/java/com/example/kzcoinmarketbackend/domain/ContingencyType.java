package com.example.kzcoinmarketbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum ContingencyType {
    OCO
}
