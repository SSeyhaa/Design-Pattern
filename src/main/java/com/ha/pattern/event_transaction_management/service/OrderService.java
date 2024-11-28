package com.ha.pattern.event_transaction_management.service;

import com.ha.pattern.event_transaction_management.event.order.OrderCreatedEvent;
import com.ha.pattern.event_transaction_management.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
// @Transactional (add this annotation)
@RequiredArgsConstructor
@Slf4j
public class OrderService {
  /*

  traditional implementation

   */
  //    private final InventoryService inventoryService;
  //    private final NotificationService notificationService;
  //    private final LoyaltyService loyaltyService;
  //
  //    public void placeOrder(Order order) {
  //        // Save order
  //        // Update inventory
  //        // Send notification
  //        // Update loyalty points
  //        // What happens if one of these operations fails?
  //    }

  // ---------------------------------------------------------------

  private final ApplicationEventPublisher eventPublisher;

  //  private final OrderRepository orderRepository;

  public Order placeOrder(Order order) {
    log.info("----- saving order to database");
    // Order savedOrder = orderRepository.save(order);
    Order savedOrder = new Order();

    // publish the event
    eventPublisher.publishEvent(new OrderCreatedEvent(savedOrder));
    return savedOrder;
  }
}
