package com.veezy.petclinic.repository;

import com.veezy.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
