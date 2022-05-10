package br.com.banco.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.Operation;
import br.com.banco.service.OperationService;


@RestController
@RequestMapping("/extrato")
@CrossOrigin(origins = "*", maxAge = 3600)
public class OperationEndPoint {

    @Autowired
    private OperationService operationService;

    OperationEndPoint(OperationService operationService){
        this.operationService = operationService;
    }

    @GetMapping
    public ResponseEntity<List<Operation>> getAllOPerations(){
        
       return ResponseEntity.status(HttpStatus.OK).body(this.operationService.getAllOperations());
      
    }

}
