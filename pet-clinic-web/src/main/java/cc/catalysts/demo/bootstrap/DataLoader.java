package cc.catalysts.demo.bootstrap;

import cc.catalysts.demo.model.Owner;
import cc.catalysts.demo.model.Vet;
import cc.catalysts.demo.services.OwnerService;
import cc.catalysts.demo.services.VetService;
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
        owner1.setFirstName("Blaj");
        owner1.setLastName("David");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Blaj");
        owner2.setLastName("Sefora");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Marius");
        vet1.setLastName("Adrian");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marcel");
        vet2.setLastName("Ciobanu");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
