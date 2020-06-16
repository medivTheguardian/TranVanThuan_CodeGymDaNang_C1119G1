export class Service {
  id: number;
  idService: string;
  serviceName: string;
  numberOfFloors: number;
  area: number;
  maxPeople: number;
  fee: number;
  rentType: string;
  status: string;

  // tslint:disable-next-line:max-line-length
  constructor(id: number, idService: string, serviceName: string, numberOfFloors: number, area: number, maxPeople: number, fee: number, rentType: string, status: string) {
    this.id = id;
    this.idService = idService;
    this.serviceName = serviceName;
    this.numberOfFloors = numberOfFloors;
    this.area = area;
    this.maxPeople = maxPeople;
    this.fee = fee;
    this.rentType = rentType;
    this.status = status;
  }
}
