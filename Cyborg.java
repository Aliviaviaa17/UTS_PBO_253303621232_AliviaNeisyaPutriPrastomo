// File: Cyborg.java
public class Cyborg extends Agent {
    public Cyborg(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void ultimateSkill() {
        System.out.println("[" + name + "] Menembakkan Laser Plasma!");
    }
}