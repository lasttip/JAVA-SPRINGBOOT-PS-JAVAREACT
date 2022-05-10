package br.com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.banco.model.Operation;
import br.com.banco.service.OperationService;



public class OperationController {
    
    @Autowired
    private OperationService operationService;


    OperationController(OperationService operationService){
        this.operationService = operationService;
    }

    public List<Operation> getAll(){
        return this.operationService.getAllOperations();
    }


}
