package com.cg.service;

import com.cg.model.Transfer;
import com.cg.model.dto.TransferHistoryDTO;
import com.cg.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransferServiceImpl implements ITransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Override
    public List<Transfer> findAll() {
        return transferRepository.findAll();
    }

    @Override
    public Optional<Transfer> findById(Long id) {
        return transferRepository.findById(id);
    }

    @Override
    public Transfer getById(Long id) {
        return transferRepository.getById(id);
    }

    @Override
    public Transfer save(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<TransferHistoryDTO> findAllTranfer() {
        return transferRepository.findAllTranfer();
    }

    @Override
    public BigDecimal totalAmount() {
        return transferRepository.totalAmount();
    }
}
