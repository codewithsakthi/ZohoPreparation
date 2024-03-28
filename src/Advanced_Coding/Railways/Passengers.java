package Advanced_Coding.Railways;

public class Passengers {
    static int id =1;
    int position;
    String name;
    int age;
    String gender;
    String alloted;
    String birthPreference;
    int pId;

    public  Passengers(String name,int age,String gender,String birthPreference){
        this.name = name;
        this.age  = age;
        this.gender= gender;
        this.birthPreference=birthPreference;
        this.pId = id++;
        this.position=-1;
        this.alloted ="";
    }
}
