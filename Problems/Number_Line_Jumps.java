package Problems;

public class Number_Line_Jumps {

    /*
    Description:
    You are choreographing an animal show. The animals are jumping in the positive direction. The animals movement can be described using their starting x coordinate and their spaces moved each jump(velocity). Using x1, v1, x2, v2. Given those 4 integers return YES if the animals will ever land in the same spot and if not return NO

    Example:
        Input:
        x1 = 2
        v1 = 1
        x2 = 1
        v1 = 2


        Output:
        YES
    
    */


    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int vdiff = v1-v2;
        if(vdiff <= 0){
            return "NO";
        }

        int xdiff = x1-x2;
        if(xdiff % vdiff == 0){
            return "YES";
        }else{
            return "NO";
        }



        


    
    }



    public static void main(String[] args){
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;


        System.out.print(kangaroo(x1, v1, x2, v2));

    }
    
}
