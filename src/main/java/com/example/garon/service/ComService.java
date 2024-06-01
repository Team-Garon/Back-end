package com.example.garon.service;
import com.example.garon.domain.Form;
import com.example.garon.dto.AddFormRequest;
import com.example.garon.repository.ComRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ComService {

    private final ComRepository comRepository;


    public Form save(AddFormRequest request) {

        return comRepository.save(request.toEntity());

    }
}