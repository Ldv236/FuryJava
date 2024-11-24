package ru.ldv236.patterns.behevioral.chainOfResponsibility;

public class SMSMessageSender extends MessageSender{
    public SMSMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}