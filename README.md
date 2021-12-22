# RoomRelationships

This is a repo is to demonstrate working with multiple tables in Room only.
 < br/>
 
 ## Models
 
 1. Movie - Movie is unique and has a directorName. movieName is the pk
 2. Director - Director has directorName as pk
 3. Characters - Each Character has a name and favorite Movie
 
 ### Relationships
 
 `One to One`          
 Movie and Director can be an example of one to one relationship as movie can be directed by a single person.
      
 `One to Many`         
 Director and Movie can be taken as One to Many because one director can direct multiple movies. For this we create a MovieDirector which returns a list of movies directed.
 
 `Many to Many`        
 Movie and Character can be represented as Many to Many because one character can be a part of many movies and vice versa. 
 For this we create a associate CrossRef object which has the primary keys of both the entites. Using the crossRef Table create the required data accordingly
 
 < br/>
 - Run the added queries or check it out in the database inspector, Run this on android preview.
 - Do not run queries on 'MAIN THREAD'
  
    
