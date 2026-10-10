package edu.ucdavis.ecs160.hw1;

public class LoggingUser implements User {
    private final User wrapped;

    public LoggingUser(User wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getName() {
        System.out.println("[LOG] AdminUser.getName()");
        return wrapped.getName();
    }

    @Override
    public String getEmail() {
        System.out.println("[LOG] AdminUser.getEmail()");
        return wrapped.getEmail();
    }

    @Override
    public void setEmail(String email) {
        System.out.println("[LOG] AdminUser.setEmail(\"" + email + "\")");
        wrapped.setEmail(email);
    }
}
