package ru.ldv236.patterns.behevioral.chainOfResponsibility;

public abstract class MessageSender {
    private PriorityLevel priorityLevel;
    private MessageSender nextMessageSender;

    public MessageSender(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void setNextMessageSender(MessageSender nextMessageSender) {
        this.nextMessageSender = nextMessageSender;
    }

    public void messageSenderManager(String message, PriorityLevel level){
        if(level.ordinal() >= priorityLevel.ordinal()){
            write(message);
        }
        if(nextMessageSender != null){
            nextMessageSender.messageSenderManager(message, level);
        }
    }

    public abstract void write(String message);
}
