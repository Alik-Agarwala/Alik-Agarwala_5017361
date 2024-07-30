package Week1.Module1DesignPatternsAndPrinciples.CommandPattern;

public class Main {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light("Living Room");

        // Create the concrete command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create the invoker and set the command
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
