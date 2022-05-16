package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class AlertNotificationService implements NotificationService {
    private AlertService alertService;

    @Override
    public void sendNotification(final Notification notification) {
        final AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle());
        alertMessage.setFor(notification.getReceiver());
        alertService.add(alertMessage);
    }
}
