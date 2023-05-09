package HWClass17;

public class Task002 {

        //Write a java class that have 4 constructors with 4 different access levels of constructors
        // (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
        // 2 - from outside the class;
        // 3 - from different class inside different package  and observe result.
        String name;
        int number;

        private Task002(String name, int number) {
            this.name = name;
            this.number = number;
            System.out.println("Name: "+name +" number: "+ number);
        }
        public Task002(String name){
            this.name=name;
            System.out.println("Name "+name);
        }
        Task002(){
        }
        protected Task002(int number){
            this.number=number;
            System.out.println("Number "+number);
        }

        public static void main(String[] args) {
            Task002 obj=new Task002();
            System.out.println(obj.name="Yaya");
            Task002 obj2=new Task002("Yaya",999);
            Task002 obj3=new Task002("Yaya");
            Task002 obj4=new Task002(999);

        }
    }

