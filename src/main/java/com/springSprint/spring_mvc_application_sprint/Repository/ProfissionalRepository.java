package com.springSprint.spring_mvc_application_sprint.Repository;


import com.springSprint.spring_mvc_application_sprint.Model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}