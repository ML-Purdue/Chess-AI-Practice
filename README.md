# Chess-AI-Practice
A good environment to practice MiniMax and Alpha-Beta-Pruning

## Pair Programming
We want you to use pair programming for this project. Find someone next to you to team up with.

One of you will be the "driver" (the person who writes the code), and the other person is the "observer", reviewing each line as it is typed and providing feedback if something doesn't look right or if they don't understand what the driver is doing.

You should switch driver and observer when you finish DFS and start BFS, to give both of you equal practice with both rolls, as well as writing graph searching code.

You can read more about pair programming [here.](https://en.wikipedia.org/wiki/Pair_programming)

## Graph Search Resource
[Here](https://docs.google.com/presentation/d/1eASDi99BBHW2Rq1y1On0kcTI53h3Udsp7YOGrS35NVo/edit?usp=sharing) are the slides I used last week. They contain sudocode for implementing DFS and BFS, if you don't know where to start, it's here. 

## Installing
**To get this on your computer:**

1) Clone the repository onto your computer. If you don't know how to do this, open up the terminal and type:

```bash
cd sigai
git clone https://github.com/PurdueSIGAI/Chess-AI-Practice.git
```

2) Open up IntelliJ

3) Do File -> Open, select the folder "Chess-AI-Practice" where you cloned it (in the "sigai" folder if you executed the above).

## Testing
You can run the program by executing ^r or doing Run -> Run.

When you run the program, you can specify a white player and a black player. At least one of these should be the AI you are testing.

There are several AI's already in the program, you can run yours against theirs to see how good it is.

## Your task - Week 1
Your task is to complete the MiniMax algorithm in MiniMaxAI.java class in the 'you' package.
## The API
####All of the classes you need to worry about are in the 'you' package.
####The recursive function you implement will have four parameters:
* What ply (number of moves into the future) you're currently on.
* What ply you should finish on
* An object representing the board
* An enum value representing the currenty player to-move
####To evaluate 
