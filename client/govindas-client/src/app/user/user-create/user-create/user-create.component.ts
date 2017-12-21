import { Component, OnInit } from '@angular/core';
import {User} from '../../../model/User';
import {UserService} from '../../user.service';
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-user-create',
  templateUrl: './user-create.component.html',
  styleUrls: ['./user-create.component.css']
})
export class UserCreateComponent implements OnInit {


  constructor(private userService: UserService) { }

  ngOnInit() {
  }
  addUser(addUser: NgForm){
    console.log(addUser.value);
    this.userService.addUser(addUser.value).subscribe( result => console.log(result),
    error => console.log(error));
  }
 


}
