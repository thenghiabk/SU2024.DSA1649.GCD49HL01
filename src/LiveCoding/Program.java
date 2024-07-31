package LiveCoding;

class Student {
    // data
    private String name;

    // constructor
    public Student(String name){
        this.name = name;
    }
    // methods
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Program {
    public static void main(String[] args) {


//        int r = Math.max(3,9);
//        System.out.println(r);

        Student s1 = new Student("John");
        System.out.println(s1.getName()); // John
        s1.setName("Lucy");
        System.out.println(s1.getName()); // Lucy
//
//        Student s2 = new Student("David");
//        System.out.println(s2.getName()); // David

//        String result = sayHelloWorld();
//        System.out.println(result);
//
//        result = sayHello("John");
//        System.out.println(result);
//
//        sayAnything(10);
    }

    public static String sayHelloWorld(){
        return "Hello World";
    }

    public static String sayHello(String name){
        return "Hello " + name;
    }

    public static void sayAnything(int numberOfLoop){
        for( int i = 0 ; i < 1000 ; i++){
            if(i == numberOfLoop){
                break;
            }
            System.out.println("Hello Anything!");
        }

//        System.out.println("Hello Anything!");
//        System.out.println("Hello Anything!");
//        System.out.println("Hello Anything!");
//        System.out.println("Hello Anything!");
//        System.out.println("Hello Anything!");
    }
}
