void setup(){
  size(800,300);
}

void draw(){
  background(0);
  fill(255);
  ellipse(200,150,200,100);
  ellipse(600,150,200,100);
  fill(0);
  ellipse(mouseX-200,mouseY,20,20);
  ellipse(mouseX+200,mouseY,20,20);
}