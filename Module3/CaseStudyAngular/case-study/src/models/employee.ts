export class Employee {
  id: number;
  idEmployee: string;
  fullName: string;
  position: string;
  literacy: string;
  departments: string;
  birthday: string;
  idCardNumber: string;
  salary: number;
  phoneNumber: string;
  email: string;
  address: string;


  // tslint:disable-next-line:max-line-length
  constructor(id: number, idEmployee: string, fullName: string, position: string, literacy: string, departments: string, birthday: string, idCardNumber: string, salary: number, phoneNumber: string, email: string, address: string) {
    this.id = id;
    this.idEmployee = idEmployee;
    this.fullName = fullName;
    this.position = position;
    this.literacy = literacy;
    this.departments = departments;
    this.birthday = birthday;
    this.idCardNumber = idCardNumber;
    this.salary = salary;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
  }
}
