package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.model.Vacine;
@Repository
public interface VacineRepo extends JpaRepository<Vacine,String>{

}
