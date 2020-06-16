import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-picker',
  templateUrl: './color-picker.component.html',
  styleUrls: ['./color-picker.component.css']
})
export class ColorPickerComponent implements OnInit {

  backgroundColor = "#1b6ca8";

  onChange(value) {
    this.backgroundColor = value;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
