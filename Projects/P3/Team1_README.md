# PacMan: Team1

Ankit Adhikari, Logan O'Connell, Rushil Savalia, Vrunda Jasani

![PacMan Game Image]()

## How to run code from command line



## Functions and Tests description

## PacMan class

### get_valid_moves()
* **Description:** This method will utilize the current location and view around the Pacman. It will return all of the locations that contain a cookie or are empty. 




### move()
* **Description:** This method uses the get_valid_moves method to find the possible locations that PacMan can move, given his current location. The method then chooses to move in one of those directions. It will return true if the move was successful, false otherwise.

* **TestPacManMove:** This method adds pacman and surrounds it with ghosts, expecting move() to return false. The method also adds pacman to a NoFrame, surrounded by nothing expecting it to return true



### is_ghost_in_range()




### consume()

* **Description:** This method checks if the current location of pacman (x, y) contains a 'cookie' then it will call eatCookie function of Map class and will return the cookie component else it would return null.


* **TestConsume:** This test checks whether the cookie is present at the pacman's current location and as the coordinates of pacman are (9,12) where the cookie is not presesnt so it will return null.



## Ghost class

### get_valid_moves()
* **Description:** This method will utilize the current location and view around the Ghost. It will return all of the locations that contain a cookie or are empty. 


### move()

* **Description:** This function uses the get_valid_moves function to find the possible locations that a ghost can move to from its current location and chooses to move in one of those directions. It will return true if the move was successful, false otherwise.

* **TestGhostMove:** This method creates one ghost in a NoFrame at 9,12 and checks whether the ghost can move, expecting it to be true.


### is_pacman_in_range()

* **Description:** This method checks its surroundings to see if any Ghosts are in attack range. The attack radius of a ghost is 1 which means that a ghost at location (x, y) can attack PacMan as long as PacMan is located at (x +/- 1, y +/- 1). If any Ghosts are in the attack range, this method returns true otherwise it returns false.

* **TestPacManInRange:** This method creates one PacMan and one Ghost right next to it, and if the method finds PacMan correctly it returns true, otherwise false.



### attack()

* **Description:** This function checks whether the pacman is in range of attack by calling is_pacman_in_range function. If the pacman is attacked it will return true else it will return false.


* **TestAttack:** This test checks whether the pacman is in the range of the ghost and was attacked or not.


## Map class

### move(String name, Location loc, Type type)
* **Description:** This method will update the Map and actually move the object associated with the name, location, and type to the new location. It will return true if the move worked successfully, and false otherwise.

### getLoc(Location loc)
* **Description:** This functions checks what is at the current location, loc. It returns Empty, Pacman, Cookie, Ghost, or Wall.

* **TestMapGetLoc:** This method adds a Pacman at location 9,11 and uses getLoc(9,11) to check whether Pacman is returned. 

### attack(String name)

* **Description:** The method controls ghosts attacking pacman. If the ghost was able to successfully attack pacman and update the display to do so return true, otherwise return false.

* **TestMapAttack:** This method creates PacMan and a Ghost next to each other, and ensures that an attack from that position would be successful.

### eatCookie(String Name)

* **Description:** This functions checks whether the function was able to update the display to eat a cookie. if is was successful then it returns the cookie component else it will just return null.

* **TestMapEatCookie:** This test checks that as there is no cookie at pacman's location(4,6) fo the funtion should return null.
