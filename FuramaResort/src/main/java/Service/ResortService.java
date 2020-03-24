package Service;

import Commons.CSVfile;
import Models.House;
import Models.Room;
import Models.Villa;
import Validation.ServiceValidation;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ResortService {
    private Scanner scanner;
    private ServiceValidation serviceValidation;
    private CSVfile csVfile;
    private List<Villa> villaList;
    private List<House> houseList;
    private List<Room> roomList;

    public ResortService() {
        scanner = new Scanner(System.in);
        serviceValidation = new ServiceValidation();
        csVfile = new CSVfile();
        villaList = csVfile.readVillaCsv();
        houseList = csVfile.readHouseCsv();
        roomList = csVfile.readRoomCsv();

    }

    public void addListVilla() {
        String inputID;
        Villa villa = new Villa();

        System.out.println("Enter Id:");
        inputID = scanner.nextLine();
        villa.setId(inputID);
        villa.setServicesName(serviceValidation.validateServiceName());
        villa.setArea(serviceValidation.validateArea());
        villa.setFee(serviceValidation.validateFee());
        villa.setNumbersOfPeople(serviceValidation.validateNumberOfPeople());
        villa.setRentType(serviceValidation.validateRentType());
        villa.setRoomStandard(serviceValidation.validateRoomStandard());
        villa.setDescription(serviceValidation.validateDescription());
        villa.setPoolArea(serviceValidation.validatePoolArea());
        villa.setNumberOfFloor(serviceValidation.validateNumberOfFloor());

        villaList.add(villa);
        csVfile.writeVillaCsv(villaList);

    }

    public void addListHouse() {
        String inputID;
        House house = new House();

        System.out.println("Enter Id:");
        inputID = scanner.nextLine();
        house.setId(inputID);
        house.setServicesName(serviceValidation.validateServiceName());
        house.setArea(serviceValidation.validateArea());
        house.setFee(serviceValidation.validateFee());
        house.setNumbersOfPeople(serviceValidation.validateNumberOfPeople());
        house.setRentType(serviceValidation.validateRentType());
        house.setRoomStandard(serviceValidation.validateRoomStandard());
        house.setDescription(serviceValidation.validateDescription());
        house.setNumberOfFloor(serviceValidation.validateNumberOfFloor());

        houseList.add(house);
        csVfile.writeHouseCsv(houseList);


    }

    public void addListRoom() {
        String inputID;
        Room room = new Room();

        System.out.println("Enter Id:");
        inputID = scanner.nextLine();
        room.setId(inputID);
        room.setServicesName(serviceValidation.validateServiceName());
        room.setArea(serviceValidation.validateArea());
        room.setFee(serviceValidation.validateFee());
        room.setNumbersOfPeople(serviceValidation.validateNumberOfPeople());
        room.setRentType(serviceValidation.validateRentType());
        room.setFreeServices(serviceValidation.validateFreeServices());

        roomList.add(room);
        csVfile.writeRoomCsv(roomList);
    }


    public void showVillaService() {

        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());

        }
    }
    public void showHouseList() {

        for (House house : houseList) {
            System.out.println(house.showInfor());
        }
    }
    public void showRoomList() {

        for (Room room : roomList) {
            System.out.println(room.showInfor());
        }
    }

    public void showAllVillaNotDuplicate() {
        Set<Villa> villaTreeSet = new TreeSet<>(villaList);
        for (Villa villa : villaTreeSet) {
            System.out.println("--------------------------------------------------");
            System.out.println(villa.getServicesName());
        }
    }

    public void showAllHouseNotDuplicate() {
        Set<House> houseTreeSet = new TreeSet<>(houseList);
        for (House house : houseTreeSet) {
            System.out.println("--------------------------------------------------");
            System.out.println(house.getServicesName());
        }
    }

    public void showAllRoomNotDuplicate() {
        Set<Room> roomTreeSet = new TreeSet<>(roomList);
        for (Room room : roomTreeSet) {
            System.out.println("--------------------------------------------------");
            System.out.println(room.getServicesName());
        }
    }
}

