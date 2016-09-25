class BeerSong{
 public static void main(String[] args){
  
  final String bottles1 = " Bottles of beer on the wall, ";
  final String bottles2 = " Bottles of beer \n Take one down, pass it around, ";
  Ninety_Nine_Bottles_of_Beer();
 }//main
 public void Ninety_Nine_Bottles_of_Beer(){
  for(int i=99;i>0;i--){
 
   if (i==1){System.out.print(""+i+" Bottle of beer on the wall, "+i+" Bottle of beer \n Take one down pass it around there are no more bottles of beer on the wall");
   }//if
   System.out.print(""+i+bottles1+i+bottles2+i+bottles1+"");
  }//for
  
 }//99bottles method
}//class
