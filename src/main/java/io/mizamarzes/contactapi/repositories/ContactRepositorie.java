package io.mizamarzes.contactapi.repositories;

import org.springframework.stereotype.Repository;

import io.mizamarzes.contactapi.domain.Contact;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ContactRepositorie extends JpaRepository<Contact, String>{
    Optional<Contact> findById(String id);
}
