int x=600;

int y=340;

int y1= 0;

int x1= 400;
PImage creeper;
void setup(){
  size(800, 450);
  PImage minecraft = loadImage("background.jpg"); 
  creeper=loadImage("creeper.png");//in setup method
  creeper.resize(5, 5);
    //in setup method
background(minecraft);     //in setup method
}



void draw (){
  
  image(creeper, x, y); 
  
  
  if(mousePressed){
   fill(255,0,0);
    ellipse(mouseX, mouseY, 5,5);
  }
    if(mousePressed&&mouseX<50&&mouseY<50){
      fill(0,255,0);
    ellipse(mouseX, mouseY, 5,5);
    }
    

if(mousePressed&&isNear(x,mouseX)&&isNear(y,mouseY)){
      fill(0,255,0);
    ellipse(mouseX, mouseY, 5,5);
   System.out.println("You found the creeper!");
}

 
  
  
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}