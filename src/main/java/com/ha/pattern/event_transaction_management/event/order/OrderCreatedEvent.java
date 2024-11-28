package com.ha.pattern.event_transaction_management.event.order;

import com.ha.pattern.event_transaction_management.model.Order;
import java.time.LocalDateTime;

public record OrderCreatedEvent(Order order, LocalDateTime timestamp) {
  public OrderCreatedEvent(Order order) {
    this(order, LocalDateTime.now());
  }
}
