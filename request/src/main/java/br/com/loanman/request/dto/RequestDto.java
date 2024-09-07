package br.com.loanman.request.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RequestDto {
    private Long id;
    private Long clientId;
    private BigDecimal value;
}
