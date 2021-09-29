---
title: Implementation
description: "Writing a method to compute the FizzBuzz value of a number."
menu: Implementation
order: 10
---

{% include ddc-abbreviations.md %}

## Overview

We'll begin by defining a _method_---a named sequence of processing instructions---that will _return_ (provide as the result of processing) the correct FizzBuzz response for a specified number. That is, 

* If the specified number is divisible by 3 _and is also_ divisible by 5, the method will return the `String` value "FizzBuzz";
* otherwise, if the specified number is divisible by 3, the method will return "Fizz";
* otherwise, if the specified number is divisible by 5, the method will return "Buzz";
* otherwise, the method will return the specified number as a `String`.

## Creating a package

In Java, classes and interfaces are organized into _packages_. Packages are very similar in concept to directories or folders---and in fact, packages are implemented as directories in the underlying filesystem. 

Package names may contain only alphanumeric characters and the underscore (`_`). Conventionally, they are written entirely in lowercase. In some style guides, if a package name consists of multiple words, the underscore is used as a separator. **However**, in the style guide used in the Deep Dive Coding Java + Android Bootcamp, and in the Google Style Guide that the DDC style guide is based on, underscores are never used in package names, and the lowercase convention is strictly followed.

Packages, like directories, can be (and usually are) hierarchical. However, where Windows uses the backslash character (`\`) between the directories in a hierarchical directory specification, and Unix variants (including OS X) use a forward slash (`/`), Java uses a dot or period (`.`).

Another widely followed convention is that a given development organization names its packages (at least, at the top levels of the package hierarchy) using the reverse of the organization's domain name. For example, the package structure for Java code written by developers at IBM will typically start with `com.ibm`---that is, starting with a package named `com`, inside that a package named `ibm`, with additional distinctions (as needed) inside that.

Deep Dive Coding is part of CNM Ingenuity, which is itself a division of CNM. Thus, the package structure we will use will always start with `edu.cnm.deepdive`.

An IDE like IntelliJ or Eclipse lets us create a package directly; we can even create a class and specify a package that doesn't exist, in which the new class will reside, and the IDE will create the package for us. Alternatively, we can create a package 

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
        
            Note that a number may be divisible by 3 _and_ 5, in which case, following these steps, the player would first say "fizz", and then "buzz".
        
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