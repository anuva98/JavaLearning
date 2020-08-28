class Animal {

    static int weight= 200;
    static int weight1= weight+ 100;
    Animal(){
        System.out.println("Animal in Constructor : " + "Cheetah");
        System.out.println(weight);
    }

    String Animal_Name= "Elephant";
    void Name(){
        System.out.println("Animal in Function : " + Animal_Name);
        System.out.println(weight1);
    }

    public static void main (String[] args) {
        Animal a= new Animal();
        for (int i=0; i<2; i++)  a.Name();


    }

}