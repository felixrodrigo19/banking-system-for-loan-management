package br.com.loanman.request.service;

import br.com.loanman.request.dto.RequestDto;
import br.com.loanman.request.repository.RequestLoanRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RequestLoanService {

    private final RequestLoanRepository repository;
    private final ModelMapper modelMapper;

    public RequestLoanService(RequestLoanRepository requestLoanRepository, ModelMapper modelMapper) {
        this.repository = requestLoanRepository;
        this.modelMapper = modelMapper;
    }

    public Page<RequestDto> getRequestLoans(Pageable pageable) {
        return repository.findAll(pageable).map(p -> modelMapper.map(p, RequestDto.class));
    }
}
