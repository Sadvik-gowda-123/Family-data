package com.sadu.family.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {
    private String errorMessage;
    private LocalDateTime localDateTime;
}
