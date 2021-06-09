package org.pupperpals.adoption.service;

import org.pupperpals.adoption.model.Pupper;
import org.pupperpals.adoption.repository.PupperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PupperService {

    @Autowired
    PupperRepository repo;

    public List<Pupper> findAllPuppers() {
        return repo.findAll();
    }
}
