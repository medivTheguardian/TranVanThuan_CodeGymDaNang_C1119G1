export class Customer {
  id: number;
  idCustomer: string;
  customerType: string;
  fullName: string;
  birthday: string;
  idCardNumber: string;
  phoneNumber: string;
  email: string;
  address: string;


  // tslint:disable-next-line:max-line-length
  constructor(id: number, idCustomer: string, customerType: string, fullName: string, birthday: string, idCardNumber: string, phoneNumber: string, email: string, address: string) {
    this.id = id;
    this.idCustomer = idCustomer;
    this.customerType = customerType;
    this.fullName = fullName;
    this.birthday = birthday;
    this.idCardNumber = idCardNumber;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
  }
}
