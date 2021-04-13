package com.company;
public class Main
{
    int num1;
    public int myclass(){
//int $num2;
//int case;//class is a java keyword and we can't use those as identifiers
        int num5="Lydia";
        //got an error to change variable type to string
        float _num3=20.2;
// got error as illegal datatype as it is a long and declared as float
        int num4=(num1+num5+_num3);
        System.out.println(num2);//global variable for int without initialize it gives 0
// got an error for not initializing num2
        system.out.println(9num4);
        // system class must be capitalized
//int 9num4; error as not a statement(illegal declaration)

        for(int k=0;k<10;k++){
            if(k==7)
            {
                break;
            }
            else if(k==5)
            {
                System.out.println("This is five");
                continue;
            }
            System.out.println(k);
        }
        return 0;
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.mymethod();
    }
}
