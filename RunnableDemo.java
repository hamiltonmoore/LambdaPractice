
public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar
        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous run");
            }
        };// new Runnable() here


        anonRun.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambdaRun = () -> {
            System.out.println("lambda run");
        };// lambda run here

        lambdaRun.run();

    }
}


//I don't understand the way they set up their file. Maybe there are some errors.