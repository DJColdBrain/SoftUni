package ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double lenght = Double.parseDouble(reader.readLine());
        Double width = Double.parseDouble(reader.readLine());
        Double height = Double.parseDouble(reader.readLine());

        try {
            Box box = new Box(lenght, width,height);
            System.out.printf("Surface Area - %.2f%n",box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n",box.calculateLateralSurfaceArea());
            System.out.printf("Volume - %.2f%n",box.calculateVolume());
        }catch (IllegalAccessException e ){
            System.out.println(e.getMessage());
        }


    }
}