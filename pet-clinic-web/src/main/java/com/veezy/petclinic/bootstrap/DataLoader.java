package com.veezy.petclinic.bootstrap;

import com.veezy.petclinic.model.Owner;
import com.veezy.petclinic.model.Vet;
import com.veezy.petclinic.services.OwnerService;
import com.veezy.petclinic.services.VetService;
import com.veezy.petclinic.services.map.OwnerServiceMap;
import com.veezy.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        vetService = new VetServiceMap();
        ownerService = new OwnerServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mike");
        owner1.setLastName("Holla");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Tommy");
        owner1.setLastName("Egan");

        ownerService.save(owner2);
        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Papi");
        vet1.setLastName("Cholo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jay");
        vet2.setLastName("Jay");

        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}
