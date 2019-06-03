package com.example.securitydbspring.dao;



import com.example.securitydbspring.cars.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CarsDAO extends JpaRepository<Cars,Integer> {
}
