public abstract class Agent {
    protected String name;
    private int hp;

    public Agent(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) throws DeadAgentException {
        if (hp <= 0) {
            this.hp = 0;
            throw new DeadAgentException("CRITICAL: Agen " + name + " telah gugur di medan tempur!");
        }
        this.hp = hp;
    }

    public abstract void ultimateSkill();
}