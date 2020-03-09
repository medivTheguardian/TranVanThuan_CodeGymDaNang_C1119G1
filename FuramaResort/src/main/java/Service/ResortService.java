package Service;

import Commons.CSVfile;
import Models.House;
import Models.Room;
import Models.Villa;
import Validation.ServiceValidation;

import java.util.List;
import java.util.Scanner;

public class ResortService {
    private Scanner scanner;
    private ServiceValidation serviceValidation;
    private CSVfile csVfile;

    public ResortService() {
        scanner = new Scanner(System.in);
        serviceValidation = new ServiceValidation();
        csVfile = new CSVfile();
    }

    public void addListVilla() {
        String inputID;
        Villa villa = new Villa();
        List<Villa> villaList = csVfile.readVillaCsv();

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
        List<House> houseList = csVfile.readHouseCsv();

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
        List<Room> roomList = csVfile.readRoomCsv();

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
        List<Villa> villaList = csVfile.readVillaCsv();

        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());

        }
    }
    public void showHouseList() {
        List<House> houseList = csVfile.readHouseCsv();

        for (House house : houseList) {
            System.out.println(house.showInfor());
        }
    }
    public void showRoomList() {
        List<Room> roomList = csVfile.readRoomCsv();

        for (Room room : roomList) {
            System.out.println(room.showInfor());
        }
    }
}

