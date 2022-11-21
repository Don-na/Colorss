import java.util.Scanner;
import java.security.SecureRandom;
public class Colors {
    static Scanner in = new Scanner(System.in);
    static SecureRandom random = new SecureRandom();

    public static String name(String n){
    String s= n.substring(0,1).toUpperCase();
    return s;
    }
    public static int num(int pnum){
        return pnum=in.nextInt();
    }
    public static int randomColor(){
        return 153+102*random.nextInt(6);
    }
    public static void printColor(int color){
        switch (color){
            case 153 :System.out.println("Color name is : Red");break;
            case 255 :System.out.println("Color name is : Yellow");break;
            case 357 :System.out.println("Color name is : Blue");break;
            case 459 :System.out.println("Color name is : Orange");break;
            case 561 :System.out.println("Color name is : Purple");break;
            case 663 :System.out.println("Color name is : Green");break;
        }
    }
    public static int scaleColor(int x, int Color){

        return (int)(Math.sqrt(Math.pow(Color,3))* x/10);
    }
    public static void main(String[] args) {
        int color1 , color2 , x ;
        color1 = randomColor();
        color2 = randomColor();

        while (color1 == color2)
            color2 = randomColor();
        System.out.println("Enter name ");
        String name= in.next();
        System.out.println(name(name));
        System.out.println("Enter your number");

        System.out.println("Color Code is : "+ color1);
        printColor(color1);
        System.out.println("Color Code is : "+ color2);
        printColor(color2);

        System.out.println("For scalling, enter X  (from 1 to 10)");
        x = in.nextInt();
        while (x<1 || x>10){
            System.out.println("Error enter from 1 to 10");
            x = in.nextInt();
        }
        System.out.println("After scalling "+color1+" color code, the scaled code is "+scaleColor(x,color1));
        System.out.println("After scalling "+color2+" color code, the scaled code is "+scaleColor(x,color2));
    }
}
