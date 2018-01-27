void setup(){
  size(800,300);
}
int eyex=  600;
int eyey= 150;

int eyeX=  400;
int eyeY= 150;
void draw(){
  background(0);
  fill(255);
  ellipse(200,150,200,100);
  ellipse(600,150,200,100);
  fill(0);
  
ellipse(eyeX+400,eyeY,20,20);

  ellipse(eyeX,eyeY,20,20);
 
 if(mouseX>=120&&mouseX<=280){
  eyeX=mouseX;
   
 }
 else if(mouseY>=120&&mouseY<=170){
  eyeY=mouseY; 
 }



}