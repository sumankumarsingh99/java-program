
class student{
    int roll;
    String name,branch;
        void registation_no(){
            Scanner mk = new Scanner(System.in);
            System.out.println("Enter your roll Number");
            roll=mk.nextInt();
            System.out.println("Enter your Name");
            name = mk.next();
            System.out.println("Enter your Branch");
            branch = mk.next(); 
        }
        void display(){
            System.out.println("################ Students Details:- ################");
            System.out.println("Students Name is "+name);
            System.out.println("Students Roll is "+roll);
            System.out.println("Students Branch is "+branch);
        }
}
class mark extends student{
    int maths =75, english = 78, science = 80, hindi = 85, physics = 85; 
    void total(){
        int total = this.maths+this.english+this.science+this.hindi+this.physics;
        float per = total/5;
        System.out.println("Total Marks is "+total);
        System.out.println("Total percentage students gain in exam "+per+" %");
    }
}

public class inheritance_ex {
    public static void main(String[] args) {
        mark obj = new mark();
        obj.registation_no();
        obj.display();
        obj.total();

    }
}