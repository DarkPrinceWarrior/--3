package carshop.car;


import carshop.car.Mark.Ford;
import carshop.car.Mark.Toyota;

import java.util.Random;

public class Sedan extends Cars{

    public int length;

    public double price;

    public int id;

    public Sedan(int id){
this.id=id;
        if(id==0) {
            length = 4871;
            SedanSetOptions(218,true,29000,"Grey",2014);
        }

        else {

            length = 5500;
            SedanSetOptions(230,true,40000,"Gold",2010);

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

        System.out.println("Length "+length);
        System.out.println("Price according to car specialities is "+price);


    }



    public void SedanSetOptions(int a,boolean b,double c,String d,int year){

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
        double a=price.nextInt(30000+20000);
        if(length>4000){
            //discount 20%
            a=a-(a*0.2);

        }

        return a;
    }

}
