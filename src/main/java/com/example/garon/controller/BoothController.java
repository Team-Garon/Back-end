package com.example.garon.controller;

import com.example.garon.domain.Booth;
import com.example.garon.dto.AddBoothRequest;
import com.example.garon.service.BoothService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/booth")
public class BoothController {
    private final BoothService boothService;

    @PostMapping("/add")
    public ResponseEntity<Booth> addBooth(@RequestBody AddBoothRequest request){
        Booth savedBooth = boothService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedBooth);
    }

    @GetMapping("/byIds")
    public List<Booth> getBoothsById(@RequestParam List<Long> ids) {
        return boothService.getBoothsById(ids);
    }
}
