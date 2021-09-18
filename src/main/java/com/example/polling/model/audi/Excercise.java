package com.example.polling.model.audi;

public class Excercise {

    public static int topDown(int ip){
        for(int i=ip;i>0;i--){
            for(int k=i;k>0;k--){
            System.out.print("*");
            } //System.out.println("\n");
        }
        return 0;
    }
    public static int numStar(int number){
                for(int i=0;i<=number;i++){
                    for (int j = 1; j <= i; ++j)
                System.out.print(j);
            System.out.println("\n");
                    for(int j=number-i-1 ;j>0;j--){
                System.out.print("*");
            }
        }return 0000;
    }
    public  static int facto(int n){
        int [] rem= new  int[100];
        int i=0;
        while (n!=0){

            rem[i]=n%2;
            n=n/2;
            i++;
            //System.out.print(rem);

        }for(int j=i-1;j>=0;j--){
            System.out.print(rem[j]);
        }return 99;
    }

    public  static String hexa(int number){
        char [] array = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int i=0;
        String str="";
        while(number!=0){
            i=    number%16;
            str=array[i]+str;
            number=number/16;
        }
        System.out.print(str);
        return "";
    }
}
