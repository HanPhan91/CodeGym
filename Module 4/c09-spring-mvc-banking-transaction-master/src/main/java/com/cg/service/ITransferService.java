package com.cg.service;

import com.cg.model.Transfer;
import com.cg.model.dto.TransferHistoryDTO;

import java.math.BigDecimal;
import java.util.List;

public interface ITransferService extends IGeneralService<Transfer> {
    List<TransferHistoryDTO> findAllTranfer();
    BigDecimal totalAmount();
}
