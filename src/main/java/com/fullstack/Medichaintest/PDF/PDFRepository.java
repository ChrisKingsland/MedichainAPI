package com.fullstack.Medichaintest.PDF;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PDFRepository extends JpaRepository <PDF, Long> {

    Optional<PDF> findByTitle(String title);



}
