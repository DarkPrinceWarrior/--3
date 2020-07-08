package carshop.car.Mark;


import carshop.Models;

import carshop.car.Cars;
import java.util.Random;

public class Ford extends Cars {

    public int year;

    public double price;

public Ford(double price){

this.price=price;


    }

    int manufacturerDiscount;
    // (вычисляется как цена минус скидка производителя)
    public double getSalePrice(){

        Random random=new Random();
        manufacturerDiscount=random.nextInt(2000+1000);

        return (price-manufacturerDiscount);

    }


}
