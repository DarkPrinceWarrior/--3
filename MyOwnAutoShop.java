package carshop.impl;


import carshop.car.Sedan;
import carshop.car.Truck;
import carshop.interdace.Admin;
import carshop.interdace.Customer;
import java.util.Scanner;


public class MyOwnAutoShop implements Admin, Customer {

   public double sumprice=0;

public  void InfObjects(int idMark, int idType){

    Sedan[] sedan=new Sedan[2];
    Truck[] truck=new Truck[2];

boolean purchase;

    if(idMark==0){

    if(idType==0){

        truck[idMark]=new Truck(idMark);
        System.out.println("Final price is "+getCarPrice(truck[idMark].finalprice()));
        purchase=purchaseCar();
        if(purchase) {
            sumprice=getIncome(truck[idMark].finalprice());

        }
        else{
            sumprice=getIncome(0);
        }
    }
   else{
        sedan[idMark]=new Sedan(idMark);
        System.out.println("Final price is "+getCarPrice(sedan[idMark].finalprice()));
        purchase=purchaseCar();
        if(purchase) {
            sumprice=getIncome(sedan[idMark].finalprice());

        }
        else{
            sumprice=getIncome(0);
        }
    }


    }
    else{

        if(idType==0){

            truck[idMark]=new Truck(idMark);
            System.out.println("Final price is "+getCarPrice(truck[idMark].finalprice()));
            purchase=purchaseCar();
            if(purchase) {
                sumprice=getIncome(truck[idMark].finalprice());

            }
            else{
                sumprice=getIncome(0);
            }
        }
        else{
        sedan[idMark]=new Sedan(idMark);
            System.out.println("Final price is "+getCarPrice(sedan[idMark].finalprice()));
            purchase=purchaseCar();
            if(purchase) {
                sumprice=getIncome(sedan[idMark].finalprice());

            }
            else{
                sumprice=getIncome(0);
            }
        }

    }


}

    public double getIncome(double price) {

      sumprice+=price;

        return sumprice;
    }



    public  double getCarPrice(double price) {

        return price;
    }


    public  String getCarColor() {

        return null;
    }


    public  boolean purchaseCar() {

int choose;
        System.out.println("Do you want to buy a car?\n Press-0, not -1");
        Scanner input=new Scanner(System.in);
        choose=input.nextInt();
        if(choose==0){
            return true;
        }
        else {
            return false;
        }
    }


}







