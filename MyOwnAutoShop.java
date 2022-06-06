abstract class Car{
    int speed;
    double regularPrice;
    String color;
    Car (int speed,double regularPrice,String color){
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }
    void getSalePrice(){
        System.out.println(regularPrice);
    }
}

class Truck extends Car{
    int weight;
    Truck (int speed,double regularPrice,String color,int weight){
        super(speed,regularPrice,color);
        this.weight=weight;
    }
    void getSalePrice(){
        if (weight>2000){
            System.out.println("10% discount:"+(regularPrice*0.1));
        } else{
            System.out.println("20% Discount:"+(regularPrice*0.2));
        }
    }
}

class Ford extends Car{
    int year;
    int manufactureDiscount;
    Ford (int speed,double regularPrice,String color,int year,int manufactureDiscount){
        super(speed,regularPrice,color);
        this.year=year;
        this.manufactureDiscount=manufactureDiscount;
    }
    void getSalePrice(){
        super.getSalePrice();
        System.out.println(regularPrice-(double) manufactureDiscount);
    }
}

class Sedan extends Car{
    int length;
    Sedan (int speed,double regularPrice,String color,int length){
        super(speed,regularPrice,color);
        this.length=length;
    }
    void getSalePrice(){
        if (length>20){
            System.out.println("5% discount:"+(regularPrice*0.05));
        }else{
            System.out.println("10% discount:"+(regularPrice*0.1));
        }
    }
}