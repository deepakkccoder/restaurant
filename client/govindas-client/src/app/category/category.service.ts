import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import {Category} from '../model/Category';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class CategoryService {

  constructor(private http:HttpClient) { }

  addCategory(category):Observable<any>{
   
   return this.http.post('http://localhost:8090/govindas/category', category).map(this.extractData);
  }
  getAllCategories(){
    console.log("I am here in category service");
    return this.http.get('http://localhost:8090/govindas/categories');
  }
  getCategoryById(id){
    return this.http.get('http://localhost:8090/govindas/category/'+id);
  }

  deleteCategory(id){
    return this.http.delete('http://localhost:8090/govindas/category/'+id);
  }
  editCategory(id,category){
   
    return this.http.put('http://localhost:8090/govindas/category/'+id, category).map(this.extractData);;
  }

  private extractData(res: Response) {
    let body = res;
    return body || {};
}

}
