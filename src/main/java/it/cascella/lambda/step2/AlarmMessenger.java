package it.cascella.lambda.step2;

@FunctionalInterface
public interface AlarmMessenger {
    String generateAlarmMessage(String name, int level);

}
