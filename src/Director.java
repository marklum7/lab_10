public class Director extends Human{
    @Override
    public void ShowFullname() {
        System.out.println("ФИО директора:" + getFullname());
    }
    @Override
    public void Showbithdate() {
        System.out.println("Дата рождения директора: " + getbithdate());
    }
    @Override
    public void Showsalary() {
        System.out.println("Зарплата в рублях директора: " + getsalary());
    }
}