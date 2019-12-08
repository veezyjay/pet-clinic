package com.veezy.petclinic.services;

import com.veezy.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
