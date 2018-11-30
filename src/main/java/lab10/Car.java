package lab10;

import com.google.gson.annotations.Expose;

public class Car {
    //@Expose(serialize = false, deserialize = false)
    public String brand = null;

    //@Expose(serialize = true, deserialize = true)
    public int    doors = 0;

    public double    displacement = 0;

    public String toString (){
        return brand+" " + doors;
    }
}
