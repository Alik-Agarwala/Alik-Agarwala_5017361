package Week1.Module1DesignPatternsAndPrinciples.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        // Using ProxyImage to load and display images
        Image image1 = new ProxyImage("test_1.jpg");
        Image image2 = new ProxyImage("test_2.jpg");

        // Image will be loaded from remote server and then displayed
        System.out.println("Displaying image1 for the first time:");
        image1.display();

        // Image will not be loaded from remote server; it will use the cached image
        System.out.println("\nDisplaying image1 for the second time:");
        image1.display();

        // Image will be loaded from remote server and then displayed
        System.out.println("\nDisplaying image2 for the first time:");
        image2.display();

        // Image will not be loaded from remote server; it will use the cached image
        System.out.println("\nDisplaying image2 for the second time:");
        image2.display();
    }
}
