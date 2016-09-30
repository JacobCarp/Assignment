public class BeerSong {
 final static String bottles1 = " bottles of beer on the wall ";
 final static String bottles2 = " bottles of beer, \n take one down pass it around, ";

 public static void main(String[] args) {
  // TODO code application logic here
  ninety_nine_bottles();
 }
 public static void ninety_nine_bottles(){
  for(int i =99; i>0; i--){
   if(i==1){System.out.print(""+i+bottles1+i+bottles2+"there are no more bottles of beer on the wall");}

   else{System.out.print(""+i+bottles1+i+bottles2+(i-1)+bottles1+ "\n");}
  }
 }
}
