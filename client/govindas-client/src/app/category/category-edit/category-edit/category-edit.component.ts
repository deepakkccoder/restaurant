import { Component, OnInit ,Input} from '@angular/core';
import {Category} from '../../../model/Category';
import {NgForm} from "@angular/forms";
import {CategoryService} from '../../category.service';
@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent implements OnInit {

  @Input() category: Category;
  constructor(private categoryService: CategoryService) { }

  ngOnInit() {
  }
  updateCategory(updateCategory: NgForm){
    this.categoryService.editCategory(this.category.id, updateCategory);
  }

}
