package cc.catalysts.demo.services;

import cc.catalysts.demo.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Long id);

    Set<Owner> findAll();
}
