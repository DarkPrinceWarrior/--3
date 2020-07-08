package carshop;


import carshop.impl.MyOwnAutoShop;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
Scanner input=new Scanner(System.in);
boolean p=true;
int choose1,choose2,p1;
        MyOwnAutoShop myOwnAutoShop = new MyOwnAutoShop();
while(p) {
    System.out.println("Для прсмотра ряда Ford нажите - 0");
    System.out.println("Для прсмотра ряда Toyota нажите - 1");
    System.out.println();
    


    choose1 = input.nextInt();
    if (choose1 == 0) {
        System.out.println("Для просмотра Ford F-Max нажмите - 0");
        System.out.println("Для просмотра Ford Mondeo нажмите - 1");
        choose2 = input.nextInt();
        switch (choose2) {

            case 0:
                myOwnAutoShop.InfObjects(choose1, choose2);
                break;

            case 1:
                myOwnAutoShop.InfObjects(choose1, choose2);
                break;

            default:
                System.out.println("Такой модели Ford у нас нет");

        }
    } else {

        System.out.println("Для просмотра Toyota Tacoma  нажмите - 0");
        System.out.println("Для просмотра Toyota Camry нажмите - 1");
        choose2 = input.nextInt();
        switch (choose2) {

            case 0:
                myOwnAutoShop.InfObjects(choose1, choose2);
                break;

            case 1:
                myOwnAutoShop.InfObjects(choose1, choose2);
                break;

            default:
                System.out.println("Такой модели Toyota у нас нет");

        }

    }
    System.out.println("Do you want to continue?");
    System.out.println("Pres 0 to move on or 1 to finish");
    p1=input.nextInt();
    if (p1==1){
        p=false;
    }



}

        System.out.println("Common profit is "+myOwnAutoShop.sumprice);


    }



}
