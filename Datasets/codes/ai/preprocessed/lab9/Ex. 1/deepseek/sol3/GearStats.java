public record GearStats(int criticalHit, int determination, int directHit) {
    public GearStats {
        if (criticalHit < 0 || determination < 0 || directHit < 0) {
            throw new IllegalArgumentException("Stats cannot be negative");
        }
    }

    public int getTotalStats() {
        return criticalHit + determination + directHit;
    }
}