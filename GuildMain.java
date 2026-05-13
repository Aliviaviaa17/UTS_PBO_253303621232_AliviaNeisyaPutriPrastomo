public class GuildMain {
    public static void main(String[] args) {
        // Polymorphism: Upcasting
        Agent[] guildMembers = {
            new Hacker("Alivia_Neisya", 100),
            new Cyborg("Jaeje_Mine", 250)
        };

        System.out.println("--- MENGAKTIFKAN SISTEM GUILD NEO-MEDAN ---");

        for (Agent member : guildMembers) {
            member.ultimateSkill();

            // Instanceof & Downcasting
            if (member instanceof Hackable) {
                Hackable hackerMod = (Hackable) member;
                hackerMod.bypassFirewall();
            }
            System.out.println("------------------------------------------");
        }

        // Simulasi Kerusakan & Custom Exception
        try {
            System.out.println("LOG: Musuh menyerang " + guildMembers[1].name + "!");
            guildMembers[1].setHp(-50); // Memicu Exception
        } catch (DeadAgentException e) {
            System.err.println("ALARM: " + e.getMessage());
        } finally {
            System.out.println("Sistem Pertahanan Tetap Berjalan...");
        }
    }
}