package Mail;

public class UserNotification {

        MockMailService mockMailService = new MockMailService();
        public UserNotification(MockMailService mailService) {
            this.mockMailService = mailService;
        }

        public void welcomNewUser() {
            mockMailService.sendEmail(
                    "newuser@example.com",
                    "Welcome!",
                    "Welcome to our platform!"
            );

        }
    }

