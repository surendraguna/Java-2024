package com.innerClasses;

public class Test {
    private int i = 5;
    class Inner{
        int i = 10;
        void show(){
            System.out.println(this.i);
        }
    }
    public static void main(String[] args) {
        new Test().new Inner().show();;
        System.out.println("World" + new Test().i);
        String s = "hi man iam soo beauty";
        String[] str = s.split(" ", 5); //exclusive
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i].toUpperCase().substring(0, 1) + str[i].substring(1));
        }

        // anonymous class
        Test2 t2 = new Test2(){
            void print(){
                super.print();
                System.out.println("Updated print");
            }
        };

        t2.print();
    }
}

class Test2{
    void show(){
        System.out.println("show");
    }

    void print(){
        System.out.println("Print");
    }
}
