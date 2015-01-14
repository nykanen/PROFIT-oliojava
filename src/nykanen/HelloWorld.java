package nykanen;

public class HelloWorld {
    
    public void yellToWorld(String name) {
        System.out.println("Hello World it's " + name + " here!");
    }

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.yellToWorld("Lauri");
	}

}
