import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        fh.loadAllCovidData();

//        //load covidData
//        ArrayList<Covid19Data> covidData = fh.loadAllCovidData();
//
//        for(Covid19Data covid19Data : covidData){
//            System.out.println(covid19Data);
//        }
    }
}
