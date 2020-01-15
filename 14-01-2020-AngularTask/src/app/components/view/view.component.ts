import { Component, OnInit } from '@angular/core';
import { FormServiceService } from 'src/app/provider/form-service.service';
@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class ViewComponent implements OnInit {
userData=[];
  constructor(public formservice: FormServiceService) { }

  ngOnInit() {
     this.userData=this.formservice.getUserinfo();
  }

  delete(selectedItem: any) {
    for (let user of this.userData) {
      if (user.email === selectedItem.email&&user.Contact===selectedItem.Contact) {
          this.userData.splice(this.userData.indexOf(user), 1);
          break;
      }
  }
}
}


