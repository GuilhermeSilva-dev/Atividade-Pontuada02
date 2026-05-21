package com.example.AtividadePontuada02.service;

import com.example.AtividadePontuada02.dto.FuncionarioResponseDTO;
import com.example.AtividadePontuada02.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;
}
