public abstract class Human {
    protected String Fullname;
    protected String bithdate;
    protected Double salary;

    public abstract void ShowFullname();
    public abstract void Showbithdate();
    public abstract void Showsalary();

    public String getFullname(){
        return Fullname;
    }
    public void getFullname(String Fullname){
        this.Fullname = Fullname;
    }
    public String getbithdate(){
        return bithdate;
    }
    public void setbithdate(String bithdate){
        this.bithdate = bithdate;
    }
    public Double getsalary(){
        return salary;
    }
    public void setsalary(Double salary){
        this.salary = salary;
    }
}