public enum CharacterRole {
    DAMAGE {
        @Override
        public String toString() {
            return "DAMAGE";
        }
    },
    HEALER {
        @Override
        public String toString() {
            return "HEALER";
        }
    },
    TANK {
        @Override
        public String toString() {
            return "TANK";
        }
    }
}
