package com.company;

public class Code {

    public void eval(){
        int a = 3;

        if(a < 10){
            System.out.println("a less than 10");
        }

        if(a < 10) {
            System.out.println("a less than 10");
        } else{
            System.out.println("a greater or equals 10");
        }

        boolean condition = true;
        if(condition){
            if(condition){
                System.out.println("Inner block");
            }
        }

        if(a < 10){
            System.out.println("a less than 10");
        } else if (a > 10){
            System.out.println("a greater than 10");
        } else {
            System.out.println("a equals 10");
        }

        int b = a < 10 ? 1 : 0;
        System.out.println(b);

        int switchA = 1;

        switch (switchA){
            case 0:
                System.out.println("swithcA is 0");
                break;
            case 1:
                System.out.println("swithcA is 1");
                break;
            default:
                System.out.println("switchA is unknown");
        }

        int t = 0;
        for (;t< 10; t++) {
            System.out.println(t);
        }

        int i = 0;
        do{
            System.out.println(i);
            i++;
        } while (i < 10);

        for ( int j = 0;j< 10; j++) {
            System.out.println(j);
        }

        for (; ; ) {
            System.out.println("I am infinite");
        }

    }
}
