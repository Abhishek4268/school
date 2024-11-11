package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.StudentAdressEntity;

@Repository
public interface StudentAddressRepository extends JpaRepository< StudentAdressEntity , Integer >{

}
