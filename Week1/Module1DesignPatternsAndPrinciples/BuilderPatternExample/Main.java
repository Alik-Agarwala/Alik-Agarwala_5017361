package Week1.Module1DesignPatternsAndPrinciples.BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        // Create a Computer with some optional parts
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setBluetooth(true)
                .setWiFi(true)
                .build();
        System.out.println(gamingComputer);

        // Create another Computer with a different configuration
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setWiFi(true)
                .build();
        System.out.println(officeComputer);

        // Create a basic Computer without optional parts
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();
        System.out.println(basicComputer);
    }
}
