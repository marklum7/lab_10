import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Director Director = new Director();
        Boss Boss = new Boss();
        Worker Worker = new Worker();
        Human[] array = {Director, Boss, Worker};
        for (Human i : array) {
            i.getFullname(in.next());
            i.ShowFullname();

            i.setbithdate(in.next());
            i.Showbithdate();

            i.setsalary(in.nextDouble());
            i.Showsalary();
        }
    }
}