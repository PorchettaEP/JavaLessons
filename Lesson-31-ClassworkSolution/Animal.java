class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }



  // class functions
 boolean isHealthy(){
   if(this.weight> 30 && this.weight<100){
     return true;
   }
   else{
     return false;
   }
 }

 double convertPoundsToKilo(){
   return this.weight*0.45359237;
 }
  
}