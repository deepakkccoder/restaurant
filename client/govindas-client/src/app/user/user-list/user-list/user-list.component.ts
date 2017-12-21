import { Component, OnInit } from '@angular/core';
import {User} from '../../../model/User';
import {UserService} from '../../user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[];
  constructor(private userService:UserService) { 
   
  }
  ngOnInit() {
    this.getAll();
  }
  getAll(){
    this.userService.getAllUser().subscribe( (response: User[]) => this.users = response);
  }
  deleteUser(user:User){
    this.userService.deleteUser(user.id).subscribe(
      (response: User[]) => this.users = response);
  };

  

}
