import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String go = sc.nextLine();
        String[] plan = go.split(" ");
        int x = 1;
        int y = 1;

        for(String move : plan){
            if (move == "L") {
                if (y - 1 == 0){
                    continue;
                } else{
                    y--;
                }
            }
            if (move == "R") {
                if (y + 1 == n + 1){
                    continue;
                } else{
                    y++;
                }
            }
            if (move == "U") {
                if (x - 1 == 0){
                    continue;
                } else{
                    x--;
                }
            }
            if (move == "D") {
                if (x + 1 == n + 1){
                    continue;
                } else{
                    x++;
                }
            }
        }

    }
}
