package com.codenation.modulo07.service;

import com.codenation.modulo07.entity.Venda;
import com.codenation.modulo07.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    //Adicionar Venda
    public Venda add(Venda object) {
        return vendaRepository.save((Venda) object);
    }
    //Mostrar uma Venda
    public Venda get(long id) {
        return vendaRepository.findById(id);
    }
    //Atualiza dados da Venda
    public Venda update(Venda object) {
        return vendaRepository.save((Venda) object);
    }
    public Optional<Venda> findById(Long id) {
        return vendaRepository.findById(id);
    }


}