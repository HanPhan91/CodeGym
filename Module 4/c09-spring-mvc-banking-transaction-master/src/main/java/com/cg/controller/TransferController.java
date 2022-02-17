package com.cg.controller;


import com.cg.model.dto.TransferHistoryDTO;
import com.cg.service.ITransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/transfers")
public class TransferController {

    @Autowired
    private ITransferService transferService;

    @GetMapping
    public ModelAndView showHistoryPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("transfer/list");
        List<TransferHistoryDTO> listTransfer = transferService.findAllTranfer();
        modelAndView.addObject("listTransfer", listTransfer);
        BigDecimal totalAmount = transferService.totalAmount();
        modelAndView.addObject("totalAmount", totalAmount);
        return modelAndView;
    }

}
