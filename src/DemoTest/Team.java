package DemoTest;
public class Team{
    // State id,name,age,position,gender,salary
    private int id;
    private String name;
    private int age;
    private String position;
    private String gender;
    private double salary;

    public  Team( int id, String name, int age, String position, String gender, double salary){
        this.id = id;
        this.age =age;
        this.name= name;
        this.gender = gender;
        this.position =position;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void Info(){
        System.out.println("Your id is : "+ id);
        System.out.println("Your name is : "+ name);
        System.out.println("Your age is : "+ age);
        System.out.println("Your position is : "+ position);
        System.out.println("Your gender is : "+ gender);
        System.out.println("Your salary is : "+ salary);
    }

    public static void main(String[] args) {
        Team team = new Team(1 ," g", 55, "student","male",500.00);
        team.toString();
        Team team1 = new Team(2 ,"Vireak",33,"CEO", "female", 2500.00);
        team1.toString();
    }
}
