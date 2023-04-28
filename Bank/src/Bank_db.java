


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Bank_db {
    static String u_id[]= {"2005","2006","2007","2008","2009"};
  static String u_p[]= {"1234","5678","9101","3618","4219"};
  static int balance[]= {1000,2000,3000,5000,9000};
  static int transfer[]= {0,0,0,0,0};
  static int withdraw[]= {0,0,0,0,0};
  static int deposite[]= {0,0,0,0,0};
  static String dob[]={"7-12-1998","5-01-1997","12-03-1960","19-10-1970","25-12-2001"};
  
  static int check_creds(String id,String pin){
      int i;
        for(i=0;i<u_id.length;i++){
            if(id.equals(u_id[i]) && pin.equals(u_p[i])){
                login.current_id=u_id[i];
                login.current_p=u_p[i];
                login.ind=i;
                return 1;
            }
            if(id.equals(u_id[i]))
                login.ind=i;
        }
        return 0;
  }
  
  static int check_balance(int ind){
      return balance[ind];
  }
  
  static void withdraw(int ind,int a){
      balance[ind]-=a;  
      withdraw[ind]+=a;
  }
  
   static void deposite(int ind,int a){
      balance[ind]+=a;  
      deposite[ind]+=a;
  }
   
     static void transfer(int ind,int to_ind,int a){
      withdraw(login.ind,a);
       deposite(to_ind, a);
       transfer[login.ind]+=a;    
  }
   
   static int check_deposite(int ind){
      return deposite[ind];  
  }
   
   static int check_withdraw(int ind){
      return withdraw[ind];  
  }
   
   static int check_transfer(int ind){
      return transfer[ind];  
  }
   
   static void change_pin(int ind,String p){
       u_p[ind]=p;
   }
    
}
