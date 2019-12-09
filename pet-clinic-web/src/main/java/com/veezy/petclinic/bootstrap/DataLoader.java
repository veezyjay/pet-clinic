package com.veezy.petclinic.bootstrap;

import com.veezy.petclinic.model.Owner;
import com.veezy.petclinic.model.Pet;
import com.veezy.petclinic.model.PetType;
import com.veezy.petclinic.model.Vet;
import com.veezy.petclinic.services.OwnerService;
import com.veezy.petclinic.services.PetTypeService;
import com.veezy.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mike");
        owner1.setLastName("Holla");
        owner1.setAddress("5 Oron Road");
        owner1.setCity("Uyo");
        owner1.setTelephone("1234543212");

        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Tommy");
        owner2.setLastName("Egan");
        owner2.setAddress("55 Urua Ekpa Road");
        owner2.setCity("Uyo");
        owner2.setTelephone("9234543542");

        ownerService.save(owner2);
        System.out.println("Loaded owners...");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
