package stepik.oop.employee;

public class Programmer extends Employee{
    private String task = "";
    private Integer stamina = 0;
    private String code = "";

    public String coding(String task){
        return task;
    }
    public Boolean test(String code){
        return true;
    }

    public void fix(String code){}
}
