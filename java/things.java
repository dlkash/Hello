public class KillSwitch {
    public static void main(String[] args) {
        System.out.println("KillSwitch Activated ⚡");
        for (int i = 5; i > 0; i--) {
            System.out.println("Shutting down in " + i + "...");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
        System.out.println("System Offline 🛑");
    }
}
