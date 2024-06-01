package com.example.garon.repository;

import com.example.garon.domain.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComRepository extends JpaRepository<Form, Long> {

}