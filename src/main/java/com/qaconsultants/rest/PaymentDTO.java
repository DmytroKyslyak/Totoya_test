package com.qaconsultants.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PaymentDTO {
//        "paymentDate": "2021-03-11T08:50:24.165787",
//        "paymentAmount": 111.11,
//        "channel": "Channel #35",

    @JsonProperty
    private String paymentDate;
    @JsonProperty
    private Double paymentAmount;
    @JsonProperty
    private String channel;
}
