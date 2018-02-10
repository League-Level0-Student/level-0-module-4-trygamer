boolean pin = false;
PImage donkey;
PImage tail;
int x;
int y;
import ddf.minim.*;     //at the very top of your sketch
AudioSample sound1;
AudioSample sound2;//at the top of your sketch
void setup (){
  Minim minim = new Minim(this);     //in the setup method  

sound1 = minim.loadSample("homer-woohoo.wav");
sound2 = minim.loadSample("homer-doh.wav");

  size(849,800);
       //at the top of the sketch
donkey = loadImage("donkey.jpg");     //in setup method
background(donkey);     //in setup method

tail = loadImage("Donkey-tail.png"); 

}

void draw (){ 
if(mouseX<50&&mouseY<50){
  background(donkey);
}
else{  
    background(255,255,255);
}
  if(mousePressed){
 pin =true;  
 
 x=mouseX;
  
  y=mouseY;
  
  if(x>757&&x<771&&y<324&&y>299){ 
sound1.trigger();   
    
  }


  else{sound2.trigger();
  }
  }
  if(pin){
image(tail, x, y);

  }
  else{image(tail, mouseX,mouseY);
    
  
 
  
}

}