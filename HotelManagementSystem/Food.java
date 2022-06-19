

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Food implements Serializable
{
    int itemno;
    int quantity;
    float price;

    Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        switch(itemno)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
        }
    }
}