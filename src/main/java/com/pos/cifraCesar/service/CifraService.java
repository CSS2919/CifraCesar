package com.pos.cifraCesar.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CifraService {
    final com.pos.cifraCesar.repository.CifraRepository cifraRepository;

    public CifraService(com.pos.cifraCesar.repository.CifraRepository cifraRepository) {
        this.cifraRepository = cifraRepository;
    }
    @Transactional
    public com.pos.cifraCesar.model.CifraModel save(com.pos.cifraCesar.model.CifraModel cifraModel) {
        return cifraRepository.save(cifraModel);
    }
    public Optional <com.pos.cifraCesar.model.CifraModel> findById (Long id) {
        return cifraRepository.findById(id);

    }
}
