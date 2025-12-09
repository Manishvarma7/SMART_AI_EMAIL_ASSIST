package com.project.email_replyGenerator.dto;

import lombok.Data;

@Data
public class EmailRequestDto {
    private String emailContent;
    private String tone;
}
