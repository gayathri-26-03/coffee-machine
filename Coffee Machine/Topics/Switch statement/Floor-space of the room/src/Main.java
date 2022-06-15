import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        double a;
        double b;
        double c;
        double r;
        double s;
        double area;
        final double p = 3.14;
        
        switch (st)  {
            case "triangle" : 
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                s = (a + b + c) / 2;
                area = s * (s - a) * (s - b) * (s - c);
                area = Math.sqrt(area);
            
                System.out.println(area);
                break;
            case "rectangle": 
                a = scanner.nextInt();
                b = scanner.nextInt();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                r = scanner.nextInt();
                area = p * r * r;
            
                System.out.println(area);
                break;
            default: System.out.println("error"); 
                break;
        }
    }
}
