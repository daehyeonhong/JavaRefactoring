package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class OrderAlerts {
    private final NotificationService notificationService;

    public OrderAlerts(final NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void alertShipped(Order order) {
        final Notification notification = Notification.newNotification(order.toString() + " is shipped")
                .receiver(order.getEmail());
        notificationService.sendNotification(notification);
    }
}
