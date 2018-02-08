State design pattern
-- allow object to alter behavior when internal state changes
-- object will appear to change its class

-- account that maintains instance of concrete state subclass 
that defines the current state

-- state defines an interface for encapsulating the behavior 
-- associated with a particular state of context 

-- concrete state - each subclass implements a behavior 
associated with a state of context 

-- all about composition!

-- as few as possible 
States 

ATM 
hasCard
NoCard
HasPin
NoCash

How can user use the ATM 
Insert Card
Eject Card
Insert Pin
Request Cash
