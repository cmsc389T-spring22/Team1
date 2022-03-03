# PacMan: Team1

Ankit Adhikari, Logan O'Connell, Rushil Savalia, Vrunda Jasani

![PacMan Game Image]()

## How to run code from command line



## Functions and Tests description

## PacMan class

### get_valid_moves()





### move()




### is_ghost_in_range()




### consume()

* **Description:** This method checks if the current location of pacman (x, y) contains a 'cookie' then it will call eatCookie function of Map class and will return the cookie component else it would return null.


* **TestConsume:** This test checks whether the cookie is present at the pacman's current location and as the coordinates of pacman are (9,12) where the cookie is not presesnt so it will return null.



## Ghost class

### get_valid_moves()



### move()




### is_pacman_in_range()




### attack()

* **Description:** This function checks whether the pacman is in range of attack by calling is_pacman_in_range function. If the pacman is attacked it will return true else it will return false.

* **TestAttack:** 


## Map class

### move(String name, Location loc, Type type)


### getLoc(Location loc)


### attack(String name)


### eatCookie(String Name)

* **Description:** This functions checks whether the function was able to update the display to eat a cookie. if is was successful then it returns the cookie component else it will just return null.


* **TestMapEatCookie:**




