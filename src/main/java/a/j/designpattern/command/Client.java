package a.j.designpattern.command;

/**
 * Created by anjun on 3/26/16.
 */
public class Client {
    public static void main(String[] args) {
        CommandFactory cf = CommandFactory.init();
        cf.executeCommand("Light on");
        cf.listCommands();
    }
}
