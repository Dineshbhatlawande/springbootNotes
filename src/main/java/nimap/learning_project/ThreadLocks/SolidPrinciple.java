package nimap.learning_project.ThreadLocks;

public class SolidPrinciple {


    /* Solid principle
        S - single responsibility principle
        O - Open closed principle
        L - Liskov's substitution principle
        I - Interface segregation principle
        D - Dependency Inversion principle


        1)  S - single responsibility principle
           -> every class should have a single responsibility or single job or single purpose
           class OrderService{
                 place order-> send notification     // one class with multiple responsibility.
           }
           if we have to change the notification type (sms) then we have to change in order service this is wrong
           we have separate class for
           class OrderService{
             placeOrder();
           }
           class NotificationService{
             sendNotification();
           }

         2) O - Open closed principle
           -> classes should be open for extension but closed for modification.
            In doing so, we stop ourselves from modifying existing code and causing potential new bugs
            in an otherwise happy application.
            Instead of modifying existing logic, you extend behavior using inheritance, interfaces
            If tomorrow we want to add PayUPayment, we just create a new class implementing PaymentProcessor
            interface  PaymentProcessor{
               processPayment();
            }

          3)  L - Liskov's substitution principle


          4) I - Interface segregation principle
           Clients should not be forced to depend on interfaces they do not use.
           public interface NotificationService {
                void sendEmail(String to, String message);
                void sendSms(String number, String message);
                void sendPushNotification(String deviceId, String message);
           }
           in my application i just have to use the sendMail notification but here i forced to implement all method
           so,create new interface for each notification

           5)   D - Dependency Inversion principle


























     */
}
