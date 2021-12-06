# travel tester

## Summary 

> Credit: https://udemy.com/course/selenium-design-patterns-framework-design/learn/
> Demo Website: https://rahulshettyacademy.com/dropdownsPractise/

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Single Responsibility Principle (SRP) Design Pattern:

`TravelHomePage.java`

Should be able to separate page objects into independent components with single responsibilities.

## Strategy Design Pattern:

`StrategyFactor.java`

Should be able to drive and arbitrary quantity of test strategies with a single test driver; control and test/object partitioning happen in the background/backend.

## Factory Design Pattern:

`MainTest.java`

Should not need to create new objects inside of your main testing file in order to test new strategies. Should only have to pass in user-readable strings, and let the "object-factory" helper functions do the rest.

## Execute Around Design Pattern:

`MultiTrip.java`

Should be able to execute tests around states that are not "ready", on a page in question. Should be able to handle unexpected and inconsistent behavior for similar/same page elements.