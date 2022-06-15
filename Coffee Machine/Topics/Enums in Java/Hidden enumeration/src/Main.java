
public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        for (Secret letter : Secret.values()) {
            if (letter.toString().startsWith("STAR")) {
                ++counter;
            }
        }

        System.out.println(counter);
    }
}

/*
enum Secret {

    STAR, CRASH, START
}*/
