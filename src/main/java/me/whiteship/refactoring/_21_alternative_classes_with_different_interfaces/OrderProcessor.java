package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class OrderProcessor {

    private final NotificationService notificationService;

    public OrderProcessor(final NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyShipping(Shipping shipping) {
        final Notification notification = Notification.newNotification(shipping.getOrder() + " is shipped")
                .receiver(shipping.getEmail())
                .sender("no-reply@gmail.com");
        notificationService.sendNotification(notification);
    }

}
