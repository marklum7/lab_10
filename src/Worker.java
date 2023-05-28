public class Worker extends Human {
    @Override
    public void ShowFullname() {
        System.out.println("ФИО работника:" + getFullname());
    }
    @Override
    public void Showbithdate() {
        System.out.println("Дата рождения работника: " + getbithdate());
    }
    @Override
    public void Showsalary() {
        System.out.println("Зарплата в рублях работника: " + getsalary());
    }
}
