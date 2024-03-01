package it.cascella.lambda.step2;

public class Display {

    private WelcomeMessenger welcomeMessenger;
    private AlarmMessenger alarmMessenger;

    public Display(WelcomeMessenger welcomeMessenger, AlarmMessenger alarmMessenger) {
        this.welcomeMessenger = welcomeMessenger;
        this.alarmMessenger = alarmMessenger;
    }

    public void displayWelcomeMessage(String name) {
        System.out.println(welcomeMessenger.generateWelcomeMessage(name));
    }

    public void displayAlarmMessage(String name, int level) {
        System.out.println(alarmMessenger.generateAlarmMessage(name, level));
    }

}

