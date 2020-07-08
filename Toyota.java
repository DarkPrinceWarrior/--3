package carshop.car.Mark;

import carshop.car.Cars;
import carshop.Models;
import java.util.Random;

public class Toyota extends Cars{

    public int year;
    public double price;
    public Toyota(double price){

        this.price=price;


    }
    int manufacturerDiscount;
    // (вычисляется как цена минус скидка производителя)
    public double getSalePrice(){

        Random random=new Random();
        manufacturerDiscount=random.nextInt(2000+1800);

        return (price-manufacturerDiscount);
    }


}
