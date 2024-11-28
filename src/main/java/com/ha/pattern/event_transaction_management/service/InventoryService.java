package com.ha.pattern.event_transaction_management.service;

import com.ha.pattern.event_transaction_management.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InventoryService {

  public void updateStock(Order order) {
    log.info("----- updating stock for order");
  }
}
