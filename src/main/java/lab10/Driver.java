package lab10;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Driver {
    public static void main (String[] args){
        //http://tutorials.jenkov.com/java-json/gson.html

        //Gson gson = new Gson();
        //alternative way of making it with config options
        /*
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        */


        /*
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";

        Gson gson = new Gson();

        Car car = gson.fromJson(json, Car.class);
        System.out.println(car);
        */




        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        /*
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        Gson gson = builder.create();

        String json = gson.toJson(car);
        System.out.println(json);
        */
        /*
        ExclusionStrategy exclusionStrategy = new ExclusionStrategy() {
            public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                if("doors".equals(fieldAttributes.getName())){
                    return true;
                }
                return false;
            }

            public boolean shouldSkipClass(Class aClass) {
                return false;
            }
        };
        GsonBuilder builder = new GsonBuilder();
        builder.setExclusionStrategies(exclusionStrategy);

        Gson gson = builder.create();
        */
        /*
        GsonBuilder builder = new GsonBuilder();

        builder.serializeNulls();

        Gson gson = builder.create();

        Car car = new Car();
        car.brand = null;

        String json = gson.toJson(car);
        System.out.println(json);
        */
        /*
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(Car.class, new CarCreator());

        Gson gson  = gsonBuilder.create();

        Car car = new Car();
        car.brand = null;
        car.doors = 5;
        car.displacement = 5.8;

        String carJson = gson.toJson(car);


        Car car2 = gson.fromJson(carJson, Car.class);

        System.out.println(car2.brand);
        */
        Person person     = new Person();
        person.firstName  = "John";
        person.lastName   = "Doe";
        person.middleName = "Blocks";
        person.email      = "john@doe.com";

        GsonBuilder builder = new GsonBuilder();
        builder.setVersion(2.0);

        Gson gson = builder.create();

        String personJson = gson.toJson(person);

        System.out.println(personJson);




    }
}
