
public class Memory {

    private double memory = 0.0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double valueToBeStored) {
        if (valueToBeStored == Double.POSITIVE_INFINITY || 
            valueToBeStored == Double.NEGATIVE_INFINITY) {
            this.memory = 0.0;
        } else {
            this.memory = valueToBeStored;
        }
    }

    public void cancelMemory() {
        this.memory = 0.0;
    }
}
