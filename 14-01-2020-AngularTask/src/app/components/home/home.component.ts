import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { FormServiceService } from 'src/app/provider/form-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  // name = new FormControl('');

  profileForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    email: new FormControl('',Validators.email),
    Contact: new FormControl(''),
    address: new FormGroup({
      street: new FormControl(''),
      city: new FormControl(''),
      state: new FormControl(''),
      zip: new FormControl('')
    })
  });

  constructor(public formservice: FormServiceService) { }
  ngOnInit() {
   }
  updateProfile() {
    // this.profileForm.patchValue({
    //   firstName: 'Kayal',
    //   address: {
    //     street: '1616,ritchie street'
    //   }
    // });
    console.log(this.profileForm.value);
    this.formservice.setUserinfo(this.profileForm.value);
  }
}
