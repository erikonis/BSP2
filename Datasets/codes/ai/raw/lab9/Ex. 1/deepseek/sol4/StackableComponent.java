package components;

import ecs.Component;

public class StackableComponent extends Component {
    private final int maxStack;
    private int currentStack;

    public StackableComponent(int maxStack) {
        this.maxStack = maxStack;
        this.currentStack = 1;
    }

    public void increaseStack(int amount) {
        currentStack = Math.min(currentStack + amount, maxStack);
    }

    public void decreaseStack(int amount) {
        currentStack = Math.max(0, currentStack - amount);
    }

    public int getCurrentStack() { return currentStack; }
    public int getMaxStack() { return maxStack; }
}