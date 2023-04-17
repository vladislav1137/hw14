public abstract class Transport implements Servicable{
    private final String modelName;
    private final int wheelsCount;

    public String getModelName() {return modelName;}
    public int getWheelsCount() {return wheelsCount;}
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
