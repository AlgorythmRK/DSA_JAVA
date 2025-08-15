import java.util.*;
public class Cond_Stat {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int button;
        System.out.println("Enter the button");
        button=sc.nextInt();

        //bhai dekho na zyda sochne ka nai, bus example hai. Only for Syntax!

        if(button == 0){
            System.out.println("Button Zero nahin ho sakti");
        }

        else if(button < 0){
            System.out.println("Akal sahin se chal rahan kya");
        }

        else {
            System.out.println("Kuch tho gadbad hai ji");
        }
        switch(button)
        {
            case 1: System.out.println("Great");
                break;
            case 2: System.out.println("Not great");
                break;
            default : System.out.println("Maybe you pushed the wrong button");
        }
    }
}




