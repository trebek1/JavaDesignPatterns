Visitor Design Pattern
-- Allows you to add methods to classes of 
different types without much altering of those classes

-- make completely different methods depending on class used

-- allows you to define external classes that can extend 
other classes without majorly editing them 

-- basically you overload a calculation in the implemented visitor
-- pass the visitor into the visitable product 
-- use the accept method to call the correct version of the calc 

-- accept method accepts a visitor 
-- visitor then can call visit on (this) 
-- the implementation of visitor is overloaded so based on (this) you get differerent calcs 

