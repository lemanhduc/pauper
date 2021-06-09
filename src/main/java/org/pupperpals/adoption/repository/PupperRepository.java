package org.pupperpals.adoption.repository;

import org.pupperpals.adoption.model.Pupper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PupperRepository extends JpaRepository<Pupper, Long> {

}
