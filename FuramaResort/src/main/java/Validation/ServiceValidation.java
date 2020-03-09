package Validation;

import java.util.Scanner;

public class ServiceValidation {
    private String regex;
    private Scanner scanner;

    public ServiceValidation() {
        scanner = new Scanner(System.in);
    }

//
//    public static String validateID() {
//        regex = ""
//
//    }

    public String validateServiceName() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        String inputServiceName = "";

        while (true) {
            System.out.println("Enter Service Name: ");
            inputServiceName = scanner.nextLine();

            if (inputServiceName.matches(regex)) {
                break;
            } else {
                System.out.println("Service Name is not valid: ");
            }
        }

        return inputServiceName;

    }

    public double validateArea() {
        double inputArea = 0;

        while (true) {
            try {
                System.out.println("Enter Area (m2): ");
                inputArea = scanner.nextDouble();

                if (inputArea > 30) {
                    break;
                } else {
                    System.out.println("Area must be greater than 30 m2");

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return inputArea;
    }

    public double validateFee() {
        double inputFee = 0;

        while (true) {
            try {
                System.out.println("Enter Fee: ");
                inputFee = scanner.nextDouble();

                if (inputFee > 30) {
                    break;
                } else {
                    System.out.println("Fee must be greater than 0");

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return inputFee;
    }

    public int validateNumberOfPeople() {
        int inputNumberOfPeople = 0;

        while (true) {
            try {
                System.out.println("Enter Number of People: ");
                inputNumberOfPeople = scanner.nextInt();

                if (inputNumberOfPeople > 0 && inputNumberOfPeople < 20) {
                    break;
                } else {
                    System.out.println("Number of People must be greater than 0 and less than 20");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return inputNumberOfPeople;
    }


    public String validateRentType() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        String inputRentType = "";

        while (true) {
            System.out.println("Enter Rent Type: ");
            inputRentType = scanner.nextLine();

            if (inputRentType.matches(regex)) {
                break;
            } else {
                System.out.println("Rent Type is not valid: ");
            }
        }

        return inputRentType;

    }

    public String validateRoomStandard() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        String inputRoomStandard = "";

        while (true) {
            System.out.println("Enter Room Standard: ");
            inputRoomStandard = scanner.nextLine();
            if (inputRoomStandard.matches(regex)) {
                break;
            } else {
                System.out.println("Room Standard is not valid: ");
            }
        }

        return inputRoomStandard;

    }

    public double validatePoolArea() {
        double inputPoolArea = 0;

        while (true) {
            try {
                System.out.println("Enter Pool Area (m2): ");
                inputPoolArea = scanner.nextDouble();

                if (inputPoolArea > 30) {
                    break;
                } else {
                    System.out.println("Pool Area must be greater than 30 m2");

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return inputPoolArea;
    }

    public int validateNumberOfFloor() {
        int inputNumberOfFloor = 0;

        while (true) {
            try {
                System.out.println("Enter Number of Floor: ");
                inputNumberOfFloor = scanner.nextInt();

                if (inputNumberOfFloor > 0) {
                    break;
                } else {
                    System.out.println("Number of Floor must be greater than 0");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return inputNumberOfFloor;
    }

    public String validateDescription() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        String inputDescription = "";

        while (true) {
            System.out.println("Enter Description: ");
            inputDescription = scanner.nextLine();
            if (inputDescription.matches(regex)) {
                break;
            } else {
                System.out.println("Description is not valid: ");
            }
        }

        return inputDescription;

    }

    public String validateFreeServices() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        String inputFreeServices = "";

        while (true) {
            System.out.println("Enter Free Services: ");
            inputFreeServices = scanner.nextLine();
            if (inputFreeServices.matches(regex)) {
                break;
            } else {
                System.out.println("Free Services is not valid: ");
            }
        }

        return inputFreeServices;

    }

}
