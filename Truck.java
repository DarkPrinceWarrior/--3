package carshop.car;


import carshop.car.Mark.Ford;
import carshop.car.Mark.Toyota;

import java.util.Random;

public class Truck extends Cars {

    public int weight;

    public double price;

    public int id;

    public Truck(int id){

        this.id=id;

        if(id==0) {
            weight = 18000;
            TruckSetOptions(88,true,59000,"white",2019);
        }

        else {
            weight = 7000 ;
            TruckSetOptions(140,false,39000,"black",2018);
        }
    }


    public void Information(){

        System.out.println("Speed is "+speed);
        if(issellout){
            System.out.println("In stock");
        }
        else{
            System.out.println("Sold out");
        }
        System.out.println("Regular price "+regularprice);
        System.out.println("Color "+color);
        System.out.println("Weight "+weight);
        System.out.println("Price according to car specialities is "+price);

    }


    public void TruckSetOptions(int a,boolean b,double c,String d,int year){

        speed=a;
        issellout=b;
        regularprice=c;
        color=d;
        price=getSalePrice();

        if(id==0){
            Ford ford=new Ford(price);
            ford.year=year;
            Information();
            price=ford.getSalePrice();
        }
        else{

            Toyota toyota=new Toyota(price);

            toyota.year=year;
            Information();
            price=toyota.getSalePrice();

        }


    }

    public double finalprice(){

        return price;

    }


    public double getSalePrice(){

        Random price=new Random();
double a=price.nextInt(60000+50000);
        if(weight>2000){
            //discount 10%
           a=a-(a*0.1);

        }

        return a;
    }


}
