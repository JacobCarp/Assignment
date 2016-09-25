class BeerSong{
 public static void main(String[] args){
  int count = 100;
  final String bottles1 = " Bottles of beer on the wall, ";
  final String bottles2 = " Bottles of beer \n Take one down, pass it around, ";
  System.out.print(Ninety_Nine_Bottles_of_Beer());
 }
 public String Ninety_Nine_Bottles_of_Beer(){
  count = count-1;
  if (count==1){return ""+count+" Bottle of beer on the wall, "+count+" Bottle of beer \n Take one down pass it around there are no more bottles of beer on the wall";
 }
  else( return "\n"+count+bottles1+count+bottles2+(count-1)+bottles1;)

}
