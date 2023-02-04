# Java_02_tick-tack-toe_advanced
This is an advanced version of tick-tack-toe, in which you can either choose to plax the traditional game, or set the rules yourself..

How about new game rules? The original game has a fairly small choice of options.

The extended version of the game makes it hard to draw. Now, your program should accept alternative lists of options, like Rock, Paper, Scissors, Lizard, Spock, and so on. You can take the following options (don't take their relations into account; we'll speak about them further on):



In this stage, before the game starts, users can choose the options. After entering the name, they should provide a list of the options separated by a comma. For example:

rock,paper,scissors,lizard,spock
If users input an empty line, start the game with default options: rock, paper, and scissors.

Once the game options are defined, output Okay, let's start.

Regardless of the chosen options, your program, obviously, should identify which option beats which. You can use the following algorithm.

Let's imagine that the following options are involved in the game "Rock Fire Scissors Sponge Paper Air Water". Order is important.



Let us represent this line as a closed circle:


First, every option produces a draw when opposed to itself.


If Rock opposed Rock - it's a draw.

Secondly, every option beats half of the other options and is defeated by another half.

For "Rock":


The first half of the options after Rock are Fire Scissors and Sponge (Rock beat it). Another half (after first half) - Paper, Air and Water are defeated Rock.

For "Fire":


The first half of the options after Fire are Scissors, Sponge and Paper (Fire beat it). Another half (after first half) - Air, Water and Rock are defeated Fire.

And so on

How to determine which options are stronger or weaker? Take the list of options provided by the user and pick the option that you want to know the relationships of. Take all other options from the user's list. Add them to the list of options that precede the chosen option. Now, you have another list of options that don't include the user's option with a different order of elements inside. First are the options that follow the chosen one in the original list; then, there are the ones that precede it. So, in this "new" list, the first half of the options defeat the "chosen" option, and the second half is beaten by it.

Once again, never mind the "links" between the options in the picture above. They are only for illustration purposes
For example, the user's list of options is rock,paper,scissors,lizard,spock. You want to know what options are weaker than lizard. By looking at the list spock,rock,paper,scissors you realize that spock and rock beat lizard. Paper and scissors are defeated by it. For spock, it'll be almost the same, but it'll get beaten by rock and paper, and prevail over scissors and lizard.

Of course, this is not the most efficient way to determine which option prevails over which. You are welcome to try to develop other methods of tackling this problem.
