public interface CharacterEventListener {
    void onHealthChanged(Character character, int oldHealth, int newHealth);
    void onCharacterDied(Character character);
}