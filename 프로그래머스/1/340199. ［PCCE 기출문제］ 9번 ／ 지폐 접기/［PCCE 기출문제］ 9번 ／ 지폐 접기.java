import java.util.*; 
class Solution {
    static int wallet_x ;
    static int wallet_y ;
    
    public int solution(int[] wallet, int[] bill) {
        this.wallet_x = wallet[0] ; 
        this.wallet_y = wallet[1] ;
        Hobby hobby = new Hobby(bill[0] , bill[1]); 
        while(!hobby.check()){
            hobby.pold() ;
        }
        return hobby.answer;
    }
    
    static class Hobby{
        int x ;
        int y ; 
        int answer ; 
        
        Hobby(int x , int y){
            this.x = x ;
            this.y = y ; 
           
        }
        
        public void pold(){
            if(this.x > this.y){{
                 if(this.x%2 != 0){
                     this.x = (int)(this.x / 2);  
                 }
                 else {
                     this.x = this.x /2 ;
                 }
            }
               
                
            }
            else {
                 if(this.y%2 != 0){
                     this.y = (int)(this.y/ 2);  
                 }
                 else {
                     this.y = this.y/2 ;
                 }
            }
            this.answer ++ ; 
         
        }
        
        public boolean check(){
            if((this.x <= wallet_x && this.y <= wallet_y) || (this.y <= wallet_x && this.x <= wallet_y)) 
                return true ; 
            
            return false ;
        }
        
        
    }
}