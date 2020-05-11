package cc.catalysts.demo.services;

import cc.catalysts.demo.model.Pet;

import java.util.Set;

public interface PetService {



    Pet findById(Long id);

    Pet save(Long id);

    Set<Pet> findAll();

}
