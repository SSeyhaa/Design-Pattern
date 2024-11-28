package com.ha.pattern.event_transaction_management.event.order;

import com.ha.pattern.event_transaction_management.service.InventoryService;
import com.ha.pattern.event_transaction_management.service.LoyaltyService;
import com.ha.pattern.event_transaction_management.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderEventListeners {

  private final InventoryService inventoryService;
  private final NotificationService notificationService;
  private final LoyaltyService loyaltyService;

  //  @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
  public void handleInventoryUpdate(OrderCreatedEvent event) {
    inventoryService.updateStock(event.order());
  }

  //  @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
  public void handleNotification(OrderCreatedEvent event) {
    notificationService.notifyCustomer(event.order());
  }

  //  @Async
  //  @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
  public void handleLoyaltyPoints(OrderCreatedEvent event) {
    loyaltyService.awardPoints(event.order());
  }
}
