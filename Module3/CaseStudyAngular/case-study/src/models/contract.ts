import {Employee} from './employee';
import {Customer} from './customer';
import {Service} from './service';

export class Contract {
  id: number;
  idContract: string;
  employee: Employee;
  customer: Customer;
  service: Service;
  dateStart: Date;
  dateEnd: Date;
  deposit: number;
  total: number;


  // tslint:disable-next-line:max-line-length
  constructor(id: number, idContract: string, employee: Employee, customer: Customer, service: Service, dateStart: Date, dateEnd: Date, deposit: number, total: number) {
    this.id = id;
    this.idContract = idContract;
    this.employee = employee;
    this.customer = customer;
    this.service = service;
    this.dateStart = dateStart;
    this.dateEnd = dateEnd;
    this.deposit = deposit;
    this.total = total;
  }
}
