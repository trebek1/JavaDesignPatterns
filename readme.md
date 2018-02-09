Summary of Patterns

3 Kinds of patterns

Creational Patterns - Ways to create objects while hiding the creation logic rather than just using a new instance 

Structural Patterns - How class/object is comprised. Should you use inheritance? composition? Interfaces? Abstract classes? 

Behavioral Patterns - How objects communicate 


General Gang of 4 Rules 
1). Composition over Inheritance 
2). Program to the interface not to the implementation 

Creational 

1). Factory Pattern 
	-- Want a method to return one of several possible classes that share a superclass
	-- Think Several Kinds of Enemy Ships Extending from abstract class
	-- User enters input and based on input has to render a ship
	-- put if else logic in factory to determine what kind of ship to make 
	-- String typeOfShip = userInput.nextLine();
    -- theEnemy = shipFactory.makeEnemyShip(typeOfShip);

2). Singleton Pattern 
	-- Make sure only a single instance can be made 
	-- Make sure it is thread safe using synchronized (Singleton.class) ...
	-- Make constructor private to keep from subclassing or making more than one instance

3). Builder Pattern
	-- Create objects made from a bunch of other objects
	-- Hide creation of objects from client 
	-- builder part knows all specifics and each other class knows nothing about the other pieces
	-- Have a robot implementing a robot definition
	-- Create a custom definition implementing robotBuilder plan to use
	-- Have an engineer that you can pass the robotBuilder plan to. 
	-- With the plan the engineer can use his methods (defined in an interface) to
	   build each piece of the robot

4). Prototype Pattern 
	-- create new objects by cloning or copying other instances
	-- add at runtime, use when numerous potential classes that you may need at runtime
	-- less need for subclasses 
	-- use Clonable interface 
	-- Think sheepObject = (Sheep) super.clone();

5). Abstract Factory Pattern

Structural 
1). Adapter
	-- use two incompatible interfaces to work together 
	-- Target is what client expects to use
	-- Adaptee is what needs to be modified
	-- Create new class that takes the adaptee as an arg and implements the Target
	-- call adaptee methods in the target functions  
2). Bridge 
	-- Decouple abstraction from implementation so they can vary independently 
	-- Progressively adding functionality while separating out major differences using abstract classes 
	-- Create 2 layers of abstraction (devices and remote controls)
	--  

3). Composite
4). Decorator
5). Facade Pattern
6). Flyweight
7). Proxy

Behavioral
1). Chain of Responsibility
2). Command Pattern
3). Interpreter Pattern 
4). Iterator Pattern

