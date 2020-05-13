package cc.catalysts.demo.services;

import cc.catalysts.demo.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
