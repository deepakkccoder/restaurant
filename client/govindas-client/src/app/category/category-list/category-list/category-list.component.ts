import { Component, OnInit } from '@angular/core';
import {Category} from '../../../model/Category';
import {CategoryService} from "../../category.service";

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {
  categories: Category[];
  selectedCategory: Category;
  constructor(private categoryService: CategoryService) { }

  ngOnInit() {
    this.getCategories();
  }
  getCategories(){
    this.categoryService.getAllCategories().subscribe(
      (response: Category[]) => this.categories = response);
  }
  deleteCategory(category){
    this.categoryService.deleteCategory(category.id).subscribe(
      (response: Category[]) => this.categories = response);
  }
  onSelect(category){
    this.selectedCategory = category;
  }
 


}
