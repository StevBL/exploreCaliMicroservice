package com.example.ec.repo;

import java.util.Optional;

import com.example.ec.domain.TourPackage;

import org.springframework.data.repository.CrudRepository;

public interface TourPackageRepository  extends CrudRepository<TourPackage, String>{
    
    Optional<TourPackage> findByName(String name);
}
