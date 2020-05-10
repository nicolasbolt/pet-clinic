package com.nicolasbolt.petclinic.services;

import com.nicolasbolt.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
