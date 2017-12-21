import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";
import {ItemService} from '../item.service';
import {CategoryService} from '../../category/category.service';
import {Category} from '../../model/Category'

@Component({
  selector: 'app-item-create',
  templateUrl: './item-create.component.html',
  styleUrls: ['./item-create.component.css']
})
export class ItemCreateComponent implements OnInit {

  categories: Category[];
  constructor( private itemService: ItemService, private categoryService:CategoryService) { }

  ngOnInit() {
    this.getCategories();
  }

  getCategories(){
    this.categoryService.getAllCategories().subscribe(
      (response: Category[]) => this.categories = response);
      console.log(this.categories);
  }
  addItem(item:NgForm){
    console.log(item.value);
    this.itemService.addItem(item.value).subscribe( result => console.log(result),
    error => console.log(error));
  }

}
