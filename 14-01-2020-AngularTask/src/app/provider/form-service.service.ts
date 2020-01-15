import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FormServiceService {


  userinfo =[];
  constructor() { }

  //practise....
  // setUserinfo(firstName,lastName,address,street,city,state,zip)
  // {
  //   this.userinfo.firstName=firstName,
  //   this.userinfo.lastName=lastName,
  //   this.userinfo.address=address,
  //   this.userinfo.street=street,
  //   this.userinfo.city=city,
  //   this.userinfo.state=state,
  //   this.userinfo.zip=zip
  //   console.log(this.userinfo)
  // }
  // getUserinfo(){
  //   return this.userinfo
  // }


  setUserinfo(user)
  {
    this.userinfo.push(user);
  }
  getUserinfo(){

    return this.userinfo
  }

}
