import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class ItemService {

  constructor(private http: HttpClient) { }

  addItem(item){
   return this.http.post('http://localhost:8090/govindas/item',item);
  }
  getAll(){
   return this.http.get('http://localhost:8090/govindas/items');
  }
  deleteItem(id){
    this.http.delete('http://localhost:8090/govindas/item'+id);
  }
  editItem(item, id){
    this.http.put('http://localhost:8090/govindas/item/'+id, item);
  }

}
