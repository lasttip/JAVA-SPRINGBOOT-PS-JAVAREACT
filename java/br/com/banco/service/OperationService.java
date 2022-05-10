package br.com.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.banco.model.Operation;
import br.com.banco.repository.OperationRepository;

@Service
public class OperationService {

    @Autowired
    private OperationRepository operationRepository;

    public List<Operation> getAllOperations(){
        return this.operationRepository.findAll();
    }
    
}
