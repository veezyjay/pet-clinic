package com.veezy.petclinic.services;

import com.veezy.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet theVet);
    Set<Vet> findAll();
}
