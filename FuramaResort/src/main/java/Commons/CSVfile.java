package Commons;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVfile {
    private final String VILLA_FILE_DATA = "src/main/java/data/VillaData.csv";
    private final String HOUSE_FILE_DATA = "src/main/java/data/HouseData.csv";
    private final String ROOM_FILE_DATA = "src/main/java/data/RoomData.csv";


    private final String[] VILLA_HEADER = {"id", "serviceNsame", "area", "fee", "numbersOfPeople", "rentType", "roomStandard", "description", "poolArea", "numberOfFloor"};
    private final String[] HOUSE_HEADER = {"id", "serviceNsame", "area", "fee", "numbersOfPeople", "rentType", "roomStandard", "description", "numberOfFloor"};
    private final String[] ROOM_HEADER = {"id", "serviceNsame", "area", "fee", "numbersOfPeople", "rentType", "freeServices"};


    //CSVReadAndWrite for Villa

    public void writeVillaCsv(List<Villa> villas) {


        CSVWriter csvWriter = null;
        List<String[]> villaList = new ArrayList<String[]>();


        try {
            csvWriter = new CSVWriter(new FileWriter(VILLA_FILE_DATA));
            csvWriter.writeNext(VILLA_HEADER);


            for (Villa villa : villas) {

                String[] tempArray = new String[]{
                        villa.getId(),
                        villa.getServicesName(),
                        villa.getArea() + "",
                        villa.getFee() + "",
                        villa.getNumbersOfPeople() + "",
                        villa.getRentType(),
                        villa.getRoomStandard(),
                        villa.getDescription(),
                        villa.getPoolArea() + "",
                        villa.getNumberOfFloor() + ""

                };
                villaList.add(tempArray);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                csvWriter.writeAll(villaList);
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public List<Villa> readVillaCsv() {

        CSVReader csvReader = null;
        Map<String, String> map = new HashMap<>();


        try {

            for (String property : VILLA_HEADER) {
                map.put(property,property);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Villa.class);
            strategy.setColumnMapping(map);

            csvReader = new CSVReader(new FileReader(VILLA_FILE_DATA));
            CsvToBean<Villa> csvToBean = new CsvToBean<>();
            List<Villa> list = csvToBean.parse(strategy, csvReader);
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }


    }


    //CSVReadAndWrite for House

    public void writeHouseCsv(List<House> houses) {


        CSVWriter csvWriter = null;
        List<String[]> houseList = new ArrayList<String[]>();


        try {
            csvWriter = new CSVWriter(new FileWriter(HOUSE_FILE_DATA));
            csvWriter.writeNext(VILLA_HEADER);


            for (House house : houses) {

                String[] tempArray = new String[]{
                        house.getId(),
                        house.getServicesName(),
                        house.getArea() + "",
                        house.getFee() + "",
                        house.getNumbersOfPeople() + "",
                        house.getRentType(),
                        house.getRoomStandard(),
                        house.getDescription(),
                        house.getNumberOfFloor() + ""

                };
                houseList.add(tempArray);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                csvWriter.writeAll(houseList);
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public List<House> readHouseCsv() {

        CSVReader csvReader = null;
        Map<String, String> map = new HashMap<>();


        try {

            for (String property : HOUSE_HEADER) {
                map.put(property,property);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(House.class);
            strategy.setColumnMapping(map);

            csvReader = new CSVReader(new FileReader(HOUSE_FILE_DATA));
            CsvToBean<House> csvToBean = new CsvToBean<>();
            List<House> list = csvToBean.parse(strategy, csvReader);
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }


    }

    //CSVReadAndWrite for Room

    public void writeRoomCsv(List<Room> rooms) {


        CSVWriter csvWriter = null;
        List<String[]> roomList = new ArrayList<String[]>();


        try {
            csvWriter = new CSVWriter(new FileWriter(ROOM_FILE_DATA));
            csvWriter.writeNext(ROOM_HEADER);


            for (Room room : rooms) {

                String[] tempArray = new String[]{
                        room.getId(),
                        room.getServicesName(),
                        room.getArea() + "",
                        room.getFee() + "",
                        room.getNumbersOfPeople() + "",
                        room.getRentType(),
                        room.getFreeServices()

                };
                roomList.add(tempArray);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                csvWriter.writeAll(roomList);
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public List<Room> readRoomCsv() {

        CSVReader csvReader = null;
        Map<String, String> map = new HashMap<>();


        try {

            for (String property : ROOM_HEADER) {
                map.put(property,property);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Room.class);
            strategy.setColumnMapping(map);

            csvReader = new CSVReader(new FileReader(ROOM_FILE_DATA));
            CsvToBean<Room> csvToBean = new CsvToBean<>();
            List<Room> list = csvToBean.parse(strategy, csvReader);
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }


    }


}
