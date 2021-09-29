---
title: Introduction
description: "What is it, and what is it used for?"
menu: Introduction
order: 0
---

{% include ddc-abbreviations.md %}

## Overview

In its simplest form, Fizz Buzz is an arithmetic game for multiple players. It originated as a game for children, to help them understand the concept of divisibility, and practice division.[\[1\]](resources.md#fizz-buzz-wikipedia){:.superscript}

In the last couple of decades, Fizz Buzz has also become widely used as a _minimum-threshold programming test_: A problem assigned to candidates for programming jobs, a successful solution to which means very little, but failure to solve typically means the (unsuccessful) end of an interview.

## Game

### Objective

FizzBuzz is a cooperative game, in that the goal for all players is to count as high as possible during a round. The count can only increase as long as each player, in turn, gives the correct response.

### Play

1. Players sit or stand in a circle.

2. The first player of the first round may be chosen according to any appropriate method.

3. Play in rounds, until some condition is met:[^ending-condition]

    1. Each round begins with a count of 0. 
    
    2. While the round is not ended:
    
        1. The current player silently adds 1 to the count; the result becomes the new count.
        
        2. If the new count is divisible by 3, the player says the word "fizz" out loud.
        
        3. If the new count is divisible by 5, the player says the word "buzz" out loud.
        
        Note that a number may be divisible by 3 _and_ 5, in which case, following these steps, the player would first say "fizz", and then "buzz"---that is, "fizz buzz".
        
        {:start="4"}
        4. If the new count is divisible by neither 3 nor 5, the player speaks the number out loud.
        
        5. If the player has spoken incorrectly---e.g. saying "fizz" when the count is 16 (not divisible by 3), or saying "15" instead of "fizz buzz" (since 15 is divisible by both 3 and 5)---the round is over. (It is also common to have a metronome or other device marking a steady tempo, and serving as a turn timer: If the player doesn't start speaking their response before the next tick of the metronome, the round is over.) 
        
        6. The next player clockwise around the circle from the current player becomes the new current player.

[^ending-condition]: The game might end after some set amount of time, or when the count reaches at least some target value---or simply when the participants lose interest.

## Program

### Statement

The FizzBuzz programming problem is usually stated as something along these lines:

> Write a program that counts from 1 to 100 (inclusive). For each value in that range, the program must display one of these:
>
> * "Fizz", if the current value is divisible by 3 _but not by_ 5.
>
> * "Buzz", if the current value is divisible by 5 _but not by_ 3.
>
> * "FizzBuzz", if the current value is divisible by both 3 _and_ 5.
> 
> * The current value itself, if it is divisible by _neither_ 3 _nor_ 5.

### Solution criteria

There are countless example solutions for FizzBuzz, written in dozens of programming languages, available online.[\[2\]](resources.md#fizz-buzz-rosetta){:.superscript} Many available solutions are _code golf_ solutions: attempts to solve the problem in the fewest number of lines or characters possible. However, our interest here is not code golf; instead, we will aim to write a program that can be easily read and understood by other programmers, and one for which automated tests can be writtern and executed.