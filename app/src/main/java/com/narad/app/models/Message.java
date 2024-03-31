package com.narad.app.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private String messageId;
    private String from;
    private String to;
    private String messageBody;
    private Boolean isJson;
}
