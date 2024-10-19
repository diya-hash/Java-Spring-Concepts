//example not using DI
public interface Notification {
    void notify();
}

public class EmailNotification implements Notification {
    public void notify() {
        System.out.println("Sending notification via email");
    }
}

public class Employee {
    private EmailNotification emailNotification; 
    public Employee(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }
    public void notifyUser() {
        emailNotification.notify();
    }

//exaple using DI
public interface Notification{
  public void notify();
}

public class Employee{
  private Notification notification;
  public Employee(Notification notification){
      this.notification = notification;
  }
  public void notifyUser(){
    notification.notify();
  }
 }

 public class EmailNotification implements Notification{
    public void notify(){
        //implement notification via email 
    }
 }
  public static void main(String [] args){
    Notification notification = new EmailNotification();
    Employee employee = new Employee(notification);
    employee.notifyUser();
