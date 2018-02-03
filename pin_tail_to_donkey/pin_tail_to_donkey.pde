boolean pin = false;
PImage donkey;
PImage tail;
void setup (){
  size(849,800);
       //at the top of the sketch
donkey = loadImage("donkey.jpg");     //in setup method
background(donkey);     //in setup method

tail = loadImage("Donkey-tail.png"); 

}

void draw (){
    background(donkey);
  image(tail, mouseX, mouseY);
  if(mousePressed){
println("X: " + mouseX + " Y: " + mouseY);
  }
  //if(mousePressed&&mouseX>757&&mouseX<771&&mouseY<324&&mouseY>299){ 
 pin =true;
    
 
}
if(pin==true){
 
  
}