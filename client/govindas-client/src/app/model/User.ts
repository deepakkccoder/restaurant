
import {Address} from '../model/Address';
import {Account} from '../model/Account'
export class User{
    id: number;
    firstName: String;
    lastName: String;
    phoneNumber: number;
    email:String;
    adress: Address;
    account: Account;
}