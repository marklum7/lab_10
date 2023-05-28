public class Boss extends Human {
    @Override
    public void ShowFullname() {
        System.out.println("ФИО начальника:" + getFullname());
    }
    @Override
    public void Showbithdate() {
        System.out.println("Дата рождения начальника: " + getbithdate());
    }
    @Override
    public void Showsalary() {
        System.out.println("Зарплата в рублях начальника: " + getsalary());
    }
}