package com.nicolasbolt.petclinic.services;

import com.nicolasbolt.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
