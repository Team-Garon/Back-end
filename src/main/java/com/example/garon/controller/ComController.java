package com.example.garon.controller;


import com.example.garon.domain.Form;
import com.example.garon.dto.AddFormRequest;
import com.example.garon.service.ComService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class ComController {

    private final ComService comService;

    @PostMapping("/form")
    public ResponseEntity<Form> addForm(@RequestBody AddFormRequest request) {
        Form savedForm = comService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedForm);
    }


}