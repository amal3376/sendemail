package com.sendemail.sendemail.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmailContentDto {
    private String to;
    private String subject;
    private String message;
}
