package com.wizardom.websocketwithflutter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class OutputMessage {
    private String from;
    private String text;
    private String time;
}
