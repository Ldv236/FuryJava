package ru.ldv236.patterns.behevioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        // https://habr.com/ru/articles/727454/
        // создаем сами сендеры с уровнями
        MessageSender reportMessageSender = new LogReportMessageSender(PriorityLevel.LOW);
        MessageSender emailMessageSender = new EmailMessageSender(PriorityLevel.MIDDLE);
        MessageSender smsMessageSender = new SMSMessageSender(PriorityLevel.HIGH);

        // задаем последовательность - кто кого будет вызывать
        reportMessageSender.setNextMessageSender(emailMessageSender);
        emailMessageSender.setNextMessageSender(smsMessageSender);

        // и отправляем сообщение первому
        // сначала сообщение с низким уровнем
        reportMessageSender.messageSenderManager("Something is happening!", PriorityLevel.LOW);
        System.out.println("---------------------------------------------------------------------");

        // потом со средним
        reportMessageSender.messageSenderManager("Something went wrong!", PriorityLevel.MIDDLE);
        System.out.println("---------------------------------------------------------------------");

        // и с высоким
        reportMessageSender.messageSenderManager("We had a problem!", PriorityLevel.HIGH);
    }
}
