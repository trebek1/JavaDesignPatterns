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
  -- like factory but everything is encapsulated
  -- final objects use objects that use the strategy pattern (composition for features)
  -- families of related objects without specifying a concrete class 
  -- use when many objects can be changed at runtime 
  -- can get complicated!
  -- regular factory chooses which version of something to make based on input
  ----------Example -----
  -- abstract class EnemyShipBuilding can makeEnemyShip and orderEnemyShip
  -- class UFOEnemyShipBuilding extends EnemyShipBuilding
  -- Here you implement makeEnemyShip and based on input create a factory
  and use that factory to create the ship to return 
  -- Now, the ships being built are abstract but you extend to get a certain kind of ship
  -- This certain kind of ship takes a shipFactory in the constructor
  -- this allows the factory passed in to give it specific features (guns)
  ----------
  -- choose the family of ships to make 
  -- pass in the kinds you want to order 
  -- the method (make enemy ship will create the factory needed) 
  -- that factory will be passed to concrete final ship and correct pieces 
  -- will be created through composition 
  -- factory shifts from picking what kind of ship to build to making the specific
  -- ship and using other factories to make their specific kind of ships 
  -- shipfactory is now an interface instead of a class that returns a specific kind of ship
  -- specific building now chooses what factory to use in creating specific enemy ship
  -- specific enemy ship takes factory and implements correct methods 

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
	--  Define common methods explicitly in abstract classes 
	-- write uncommon methods in classes that extend the abstract classes 
	-- example: buttons 7,8 defined in entertainment device, tv device extends and defines buttons 5 and 6
	-- Abstract remote takes a device and calls its method button 5 and 6 but leaves 
	 button 9 void 
	 -- specific remotes implement button 9 as pause vs mute
3). Composite
  -- treat individual objects and compositions of objects uniformly 
  -- create an abstract class that implements all methods throwing UnsupportedOperationException();
  -- since all objects will extend from this, implement methods that you want 
  -- Example - Make songs and songGroups extend SongComponent so then you can iterate over both groups and individuals 
  -- and be able to do common things like add and remove in both places
4). Decorator 
  -- Modify an object dynamically
  -- Want capabilities of inheritance with subclasses but need to add functionality at runtime 
  -- extend with new code rather than rewriting 
  -- add functionality with many simple classes
  -- basically using composition over inheritance 
  -- Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
  -- define the plain pizza then have each successive outer function call super and add to it 
5). Facade Pattern 
  -- Create a simplified interface that performs many actions behind the scenes
  -- Can I withdraw 50 from the bank? 
  -- Check if account # is right, check security code, check funds, withdraw/deny
  -- Create a class for each action 
  -- create and instance of each in the facade class 
  -- actions are just a set of method calls to those objects 
  -- if(acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode()) &&
      fundChecker.haveEnoughMoney(cashToGet)) {System.out.println("Transaction Complete\n");};
6). Flyweight 
    - used when need to create large number of very similar objects (100k instead of 5k)
    - reduce memory usage by sharing similar features instead of always creating new ones 
    - create HashMap of objects, if one exists, then use it otherwise create a new one 
7). Proxy 
  - Create a class that limits access to another class
  -- security reasons 
  -- object is hard to create
  -- Think ATM 
  -- create an interface that has methods you want to illuminate
  -- have new object instantiate a new ATM and implement those methods
  -- Now the user only has access to what you want them to have access to

Behavioral 

1). Chain of Responsibility 
  -- group of objects between them to solve a problem
  -- if first cant solve, pass to next 
  -- create a chain interface that allows you to set next and calculate
  -- make all options implement chain 
  -- make an object that takes in data and calc type (creates dataobject)
  -- create chain by setting instances of each option together
  -- call chain1.calculate(dataObject) 
  -- chain1 will either solve or pass to next link to solve

2). Command Pattern
  -- object used to encapsulate all info needed to call method later
  -- store lists of codes to execute later using execute() or undo()
  -- Create class that sounds like what you want to do implementing command
  -- Pass the object into the class with the method you want
  -- Call the method from oject in execute() function
  -- Now pass the command to an Invoker object
  -- The invoker object will have a method that sounds like what you want to do
  -- this method will call execute and run the function referenced

3). Intrpreter Pattern
-- Interpreter pattern is normally ignored (haha)
-- Convert one representation of data into another 
-- Context - info to be interpreted
-- Expression is an abstract class that defines all methods
needed to perform the different conversions 
-- The terminal or concrete expression provides specific
conversions on different types of data 
-- create an abstract class with all the possible types
-- extend each into its own concrete class with the conversions
-- have one class that sets up the question
-- have another that takes in input and converts it and displays to screen

4). Iterator Pattern 
  -- uniform way to cycle through collection of objects 
  -- create a unique iterator method 
  -- public interface SongIterator { public Iterator createIterator(); };
  -- make iterator for each collection Iterator Songs70s = iter70sSongs.createIterator();
  -- use while(iterator.hasNext()) to go through all items
  -- Collections: bestSongs.iterator();
  -- Arrays: Arrays.asList(bestSongs).iterator();
  -- HashTables: bestSongs.values().iterator();

Other Patterns 

State Design Pattern
-- alter state when interal state changes 
-- context: Maintains an instance of a concrete state subclass
-- state defines an interface for encapsulating behavior of context 
-- concrete state: each subclass implements a behavior associated with state

-- Interface (state) that defines the state 
-- Each possible state is set in the class through composition
-- Example: ATMState noCard, hasCard, hasCorrectPin and atmOutOfMoney
  all implement the state and can be switched on using a setState method
-- methods in ATMMachine reference atmState: aka: atmState.ejectCard()

-- each concrete state (state of atm) is instantiated with (this) the context
-- so, code methods for each state depending on basic logic based on context (ATMMachine)

Template Design Pattern
-- Hoagies 
-- create group of subclasses that have to execute a similar group of methods 
-- create an abstract class that contains a method called Template Method
-- templte has set of method calls that every subclass object will call 
--  subclass can override some of the method calls

-- idea is that abstract base class defaults to true for all options 
-- override hooks to disable options that you dont want: like meat for veg sub
-- implement methods that do the things you want done (that are still true)
-- sublasses of abstract class are defined the way you want them with specific options

Strategy Design Pattern
-- lose coupling
-- Give Animals the ability to fly
-- Use Composition instead of Inheritance 
-- Change capibility at runtime 
-- give SuperClass(animal) a field public Flys flyingType
-- give SuperClass(animal) a setFlyingAbility function
-- create two classes class ItFlys implements Flys interface.. and CantFly.
-- set them in the subclasses, can still set new from super if want to make dog fly

Observer Design Pattern
-- when you need many other objects to recieve update when another object changes
-- the subject (publisher) sends many stocks to observers
-- the observers (subscribers) take the ones they want and use them
-- lose coupling
-- subject or publisher may send info to subscribers that they dont need 
-- subject interface has 3 methods: register, unregister, notifyObserver
-- observer interface has 1 method: update
-- one class implements subject and keeps track of notifying adding/removing observers
  in an arrayist 
-- one class implements observer and holds ref to object implementing subject 
-- observer just has update method that it uses to make updates when notified
-- subject registers observer in constructor 

Mediator Design Pattern
-- Handle communication between related objects (colleagues)
-- All communication handled by mediator 
-- Colleagues dont know anything about each other 
-- GOF: Allows loose coupling by encapsulating the way 
disparate sets of objects interact and communicate with each other 
-- allows the actions of each object set to vary independently of each other 

-- pass a mediator into each colleague 
-- call methods to carry out transactions using mediator

Visitor Pattern
-- basically you overload a calculation in the implemented visitor
-- pass the visitor into the visitable product 
-- use the accept method to call the correct version of the calc 

-- accept method accepts a visitor 
-- visitor then can call visit on (this) 
-- the implementation of visitor is overloaded so based on (this) you get differerent calcs
-- visitor is composition for one method 










