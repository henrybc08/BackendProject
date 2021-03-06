package com.groupa.ssi.services.catalog;

import com.groupa.ssi.model.domain.catalog.PpeClassification;
import com.groupa.ssi.model.repository.catalog.PpeClassificationRepository;
import com.groupa.ssi.services.common.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created on April 25, 2018
 * @author Walker Colina
 */
@Service
public class PpeClassificationService extends GenericService<PpeClassification> {
    @Autowired
    private PpeClassificationRepository repository;

    @Override
    protected JpaRepository<PpeClassification, Integer> getRepository() {
        return repository;
    }
}
