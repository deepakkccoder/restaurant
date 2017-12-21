import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { CategoryCreateComponent } from './category/category-create/category-create/category-create.component';
import { CategoryEditComponent } from './category/category-edit/category-edit/category-edit.component';
import { CategoryListComponent } from './category/category-list/category-list/category-list.component';
import { UserCreateComponent } from './user/user-create/user-create/user-create.component';
import { UserEditComponent } from './user/user-edit/user-edit/user-edit.component';
import { UserListComponent } from './user/user-list/user-list/user-list.component';
import { OrderCreateComponent } from './order/order-create/order-create/order-create.component';
import { OrderListComponent } from './order/order-list/order-list/order-list.component';
import { OrderEditComponent } from './order/order-edit/order-edit/order-edit.component';
import { LoginComponent } from './login/login/login.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule }    from '@angular/common/http';
import {CategoryService} from './category/category.service';
import {UserService} from './user/user.service';
import { ItemCreateComponent } from './item/item-create/item-create.component';
import { ItemListComponent } from './item/item-list/item-list.component';
import { ItemEditComponent } from './item/item-edit/item-edit.component';
import {ItemService} from '../app/item/item.service';


@NgModule({
  declarations: [
    AppComponent,
    CategoryCreateComponent,
    CategoryEditComponent,
    CategoryListComponent,
    UserCreateComponent,
    UserEditComponent,
    UserListComponent,
    OrderCreateComponent,
    OrderListComponent,
    OrderEditComponent,
    LoginComponent,
    ItemCreateComponent,
    ItemListComponent,
    ItemEditComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CategoryService, UserService,ItemService],
  bootstrap: [AppComponent]
})
export class AppModule { }
