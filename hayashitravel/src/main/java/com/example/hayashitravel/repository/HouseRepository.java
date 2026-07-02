package com.example.hayashitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hayashitravel.entity.House;

public interface HouseRepository extends JpaRepository<House, Integer> {

}
