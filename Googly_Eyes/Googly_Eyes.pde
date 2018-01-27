int eyey= 150;

int eyeX=  400;
int eyeY= 150;
void draw(){
  background(0);
  fill(255);
  ellipse(200,150,200,100);
  ellipse(600,150,200,100);
  fill(0);
  


  ellipse(eyeX,eyeY,20,20);
 
 if(mouseX>=120&&mouseX<=280){
  eyeX=mouseX;
   
 }
 else if(mouseY>=120&&mouseY<=170){
  eyeY=mouseY; 
 }


ellipse(eyex,eyey,20,20);
if(mouseX>=520&&mouseX<=680){
  eyex=mouseX;
   
 }
 else if(mouseY>=120&&mouseY<=170){
  eyey=mouseY; 
 }

}
