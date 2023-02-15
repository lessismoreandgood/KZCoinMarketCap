package com.example.kzcoinmarketbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum OCOStatus {
    RESPONSE,
    EXEC_STARTED,
    ALL_DONE
}