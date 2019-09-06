package com.company;

public class Main {

    public static void main(String[] args) {

        int data = 12345;
        int check1;
        int check2;
        int check3;
        int sum =0;
        int sum2=0;
        while(data !=0){
            check1 =data%10;
            check2 = check1;
            check3 = check2%2;
            if(check3==0){
                sum +=check2;
            }
            else {
                sum2 += check2;
            }
            data =data/10;
        }
        System.out.println(sum);
        System.out.println(sum2);


    }
}
