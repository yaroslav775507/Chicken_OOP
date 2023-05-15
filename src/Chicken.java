public class Chicken {
    private String name;
    private int age;
    public Chicken(String name, int age) throws Exception {
        setName(name);
        setAge(age);

    }
    private void setName(String name) throws Exception {
        if  ( name.isEmpty() || name.charAt(0) == ' ' ) {
            throw new Exception("Name cannot be empty." );

        }
        else {
            this.name = name;
        }
    }
    private void setAge(int age) throws Exception { //!подсказка
        if (age > 15){
            throw new Exception("Age should be between 0 and 15" );
        }
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (getAge() <=6) {
            return 2;
        }
        else if (getAge() <=12) {
            return 1;
        }
        else {
            return 0.75;
        }
    }

}
