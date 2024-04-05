import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    File file = new File("CovidData.csv");

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public ArrayList<Covid19Data> loadAllCovidData() {
           ArrayList<Covid19Data> covidData = new ArrayList<>();
           Scanner sc = null;  //hvorfor null?
  try {
        sc = new Scanner(file);

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }

    Covid19Data covid19Data = null;
    while(sc.hasNext()) {
    String line = sc.nextLine(); //Split linje og læg tokens i attributer
        String[] attributes = line.split(";");
        covid19Data = new Covid19Data(
                              attributes[0],   // region
                                     attributes[1],   // alders gruppe
                (Integer.parseInt(attributes[2])), // bekræftedeTilfældeTotalt
                (Integer.parseInt(attributes[3])), // døde
                (Integer.parseInt(attributes[4])), // indlagteIntensivAfdeling
                (Integer.parseInt(attributes[5])), // indlagte
                                     attributes[6]    //  dato
        );

       covidData.add(covid19Data);
        System.out.println(covid19Data.toString());

    }
    sc.close();
    return covidData;
}

//----------------------------------------------------------------------------------------------------------------------
}


