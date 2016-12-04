//Start a new sketch with draw and setup methods.
  PImage pepperoni;
  PImage pizza;
void setup(){
//0. Set your canvas size
  size(1000, 1000);
      pepperoni = loadImage("/Users/league/Desktop/poke_victini.png");
      pizza = loadImage("pizza.jpg");
      pepperoni.resize(100,100);
      pizza.resize(1000, 1000);
      image(pizza, 0, 0);
}
void draw(){
//1. Draw a biscuit colored ellipse for the pizza base, a red ellipse for sauce and a yellow ellipse inside (for the cheese). Do this in the setup method.
 // fill(100,100,100);
//ellipse(500, 500, 100, 100)


//2. Get a topping for your pizza.
//http://beej.us/pizza/pizza.menu.html
//i) Save the image.
  //ii) Drop the file onto your sketch.
  //iii) Load the topping image (in draw method)
  if(mousePressed){
    image(pepperoni,mouseX - 40,mouseY-40);

  }
//3. Resize your topping image. You need to do this before the image command.



//4. Add more toppings. 
  //image(toppingImage, x, y);


//5. Add the toppings where the user clicks the mouse (in draw method)
  /*mousePressed
  mouseX
  mouseY


//6. Play a sound when you add a topping…. 


//first download a sound from freesound.org and drop it onto your sketch


import processing.sound.*;            //at the top of your sketch
SoundFile sound;        //at the top of your sketch
sound = new SoundFile(this, "ding.wav");  //in the setup method      
sound.play();          //where you want the sound to play


//7. [Optional] Add a different topping with the right mouse click.
if (mousePressed && (mouseButton == RIGHT))


/*8. [Optional] Use a background image to put the pizza in a box.
PImage pizzaBox = loadImage("box.jpg");  //in setup method
pizzaBox.resize(width, height);  //to match your canvas size
background(pizzaBox);          //in setup method*/
}

