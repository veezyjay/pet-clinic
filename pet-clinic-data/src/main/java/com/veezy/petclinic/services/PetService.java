package com.veezy.petclinic.services;

import com.veezy.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet thePet);
    Set<Pet> findAll();
}
