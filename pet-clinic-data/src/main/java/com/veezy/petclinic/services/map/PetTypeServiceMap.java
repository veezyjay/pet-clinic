package com.veezy.petclinic.services.map;

import com.veezy.petclinic.model.PetType;
import com.veezy.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

}
