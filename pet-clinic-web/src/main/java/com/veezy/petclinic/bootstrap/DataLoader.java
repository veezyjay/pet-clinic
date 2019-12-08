package com.veezy.petclinic.bootstrap;

import com.veezy.petclinic.model.Owner;
import com.veezy.petclinic.model.Vet;
import com.veezy.petclinic.services.OwnerService;
import com.veezy.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Mike");
        owner1.setLastName("Holla");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Tommy");
        owner2.setLastName("Egan");

        ownerService.save(owner2);
        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Papi");
        vet1.setLastName("Cholo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jay");
        vet2.setLastName("Jay");

        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}
