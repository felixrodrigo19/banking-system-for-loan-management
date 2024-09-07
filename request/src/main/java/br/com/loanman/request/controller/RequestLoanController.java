package br.com.loanman.request.controller;

import br.com.loanman.request.dto.RequestDto;
import br.com.loanman.request.service.RequestLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/requests")
public class RequestLoanController {
    private final RequestLoanService requestLoanService;

    @Autowired
    public RequestLoanController(RequestLoanService requestLoanService) {
        this.requestLoanService = requestLoanService;
    }

    @GetMapping
    public Page<RequestDto> getRequestLoans(@PageableDefault(size = 50) Pageable pageable) {
        return requestLoanService.getRequestLoans(pageable);
    }
}
