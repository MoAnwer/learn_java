package real_world.interfaces;

import java.util.ArrayList;
import java.util.List;

interface NotificationChannel {
    void send(String messge);
}

class SMSNotificationChannel implements NotificationChannel {
    @Override
    public void send(String messge) {
        IO.println("You have sms notification: " + messge);
    }
}

class EmailNotificationChannel implements NotificationChannel {
    @Override
    public void send(String messge) {
        IO.println("You have email notification: " + messge);
    }
}

class MultiNotificationChannels implements NotificationChannel {
    private final List<NotificationChannel> channels = new ArrayList<>();

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    @Override
    public void send(String messge) {
        for (NotificationChannel notificationChannel : channels) {
            notificationChannel.send(messge);
        }
    }
}

class UserService {
    private String password;
    private final NotificationChannel notificationChannel;
    private String defaultNC;

    UserService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        this.password = "pass123";
    }

    void changePassword(String newPassword) {
        this.password = newPassword;
        this.notificationChannel.send("Your password is changed to: " + newPassword);
    }
}

public class NotificationApp {
    public static void main(String[] args) {

        String newPassword = String.valueOf(IO.readln("Enter new password : "));


        MultiNotificationChannels c = new MultiNotificationChannels();
        c.addChannel(new EmailNotificationChannel());
        c.addChannel(new SMSNotificationChannel());

        new UserService(c).changePassword(newPassword);
            
    }
}
