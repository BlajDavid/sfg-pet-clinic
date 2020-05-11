package cc.catalysts.demo.services;

import cc.catalysts.demo.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Long id);

    Set<Vet> findAll();
}
