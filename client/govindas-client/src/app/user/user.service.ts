import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';


@Injectable()
export class UserService {

  constructor(private http: HttpClient) { }
  addUser(user):Observable<any>{
    return this.http.post('http://localhost:8090/govindas/user',user).map(this.extractData);;
  }
  getAllUser(){
    return this.http.get('http://localhost:8090/govindas/users');
  }
  deleteUser(id){
    return this.http.delete('http://localhost:8090/govindas/user/'+id);
  }

  private extractData(res: Response) {
    let body = res;
    return body || {};
}

}


