package com.veezy.petclinic.services.map;

import com.veezy.petclinic.model.Specialty;
import com.veezy.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
}
