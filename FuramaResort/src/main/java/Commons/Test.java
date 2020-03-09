package Commons;

import Models.Villa;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CSVfile csVfile = new CSVfile();
        List<Villa> villaList = new ArrayList<Villa>();
        Villa villaTest = new Villa("1", "chut", 12, 100, 1, "du", "vippro", "amazing", 50, 2);

        villaList.add(villaTest);

        csVfile.writeVillaCsv(villaList);
        csVfile.readVillaCsv();
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
        
    }
}
