package za.ac.cput.novacinemaapp.repository;

/*
Gammaad Mohamed
220208344
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.novacinemaapp.domain.Notification;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, String> {
    List<Notification> findNotificationsByRecipient(String recipient);
    void deleteNotificationByRecipient(String recipient);
}
