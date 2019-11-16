# WaterRacerGame🏁
Welcome to Water Racer! This game mimicks a carnival game in which an array of players are equipped with water-ejecting implements and a corresponding target. Each player then races to hit their target which awards them points based on the accuracy of their aim. The game is won by being the first player whose score reaches a specified goal.

In our virtual analogy, the water-ejector activator for each player corresponds with a key on the keyboard. The major difference in our starter code is that, rather than depending on the accuracy of the player's aim for points, points are awarded proportional to the rate at which the player's key is pressed. That is, the player who presses their key at the most rapid rate will win.

## Starter Code
The starter code follows a MVC pattern similar to the other games in your project. The models consist of a Gauge class which stores a particular user's progress and assigns a particular keyboard key to control it, and a Game which consists of a group of Gauges participating in the race. The views consist of the GaugeView which is essentially a progress bar, and the GameView which aggregates all the Gauges onto a single frame. Lastly, the controller class is the SprayListener class. Upon a key press, it will loop through all the Gauges in a Game and will update the Gauges and views correspondingly. There is also a main class, called 'WaterRacerGame' which creates an instance of a Game and runs it in a window. 

## Challenges
- **More than two players** Allow the user to choose how many players and which keys to use. 
- **Make it interesting** Add function to increase progress in interesting ways...special keystrokes, timing patterns, randomization.
- **Design** Make the virtual game more analogous to the original.

## Reference Material


## Additional Links
- [Real life demonstration on YouTube](https://www.youtube.com/watch?v=6K34Vw2CQT0)
