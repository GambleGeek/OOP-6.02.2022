package dead.inside.ghoul;

public class HelloWorld implements MessageProvider{
    public static void main(String[] args) {
        //1 задание
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
