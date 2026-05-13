// File: Hacker.java
public class Hacker extends Agent implements Hackable {
    public Hacker(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void ultimateSkill() {
        System.out.println("[" + name + "] Menyebarkan Virus EMP!");
    }

    @Override
    public void bypassFirewall() {
        System.out.println("[" + name + "] Firewall jebol dalam 3 detik.");
    }
}