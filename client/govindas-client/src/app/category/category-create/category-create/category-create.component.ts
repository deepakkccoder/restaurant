import { Component, OnInit ,ViewChild} from '@angular/core';
import {NgForm} from "@angular/forms";
import {CategoryService} from "../../category.service";
import {Observable} from 'rxjs/Observable';


@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {

 
  constructor(private categoryService: CategoryService) { }

  ngOnInit() {
  }
  

  addCategory(addCategory:NgForm){
    this.categoryService.addCategory(addCategory.value).subscribe( result => console.log(result),
    error => console.log(error));
    
  }
  
}
