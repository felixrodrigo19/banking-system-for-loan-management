package br.com.loanman.request.repository;

import br.com.loanman.request.model.RequestLoanModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestLoanRepository extends JpaRepository<RequestLoanModel, Long> {
}
