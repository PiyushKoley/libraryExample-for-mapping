package com.example.spring.libraryManagementExample.Repository;

import com.example.spring.libraryManagementExample.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
