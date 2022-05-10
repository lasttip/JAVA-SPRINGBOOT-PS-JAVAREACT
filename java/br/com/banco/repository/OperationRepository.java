package br.com.banco.repository;

import org.springframework.stereotype.Repository;

import br.com.banco.model.Operation;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
    
}
