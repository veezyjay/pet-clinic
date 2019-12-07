package com.veezy.petclinic.services;

import com.veezy.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner theOwner);
    Set<Owner> findAll();
    Owner findByLastName(String lastName);
}
