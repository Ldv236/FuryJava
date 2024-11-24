package ru.ldv236.patterns.behevioral.chainOfResponsibility;

public class LogReportMessageSender extends MessageSender{

    public LogReportMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Message sender using simple log report: " + message);
    }
}