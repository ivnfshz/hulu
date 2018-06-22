# HULU Exercise.

This project contains the solution to if two nodes from a binary tree are cousins or not.

## Prerequisites

This solution requires the following installed tools.
 
* [Java 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Apache Maven](https://maven.apache.org/)
* [Git](https://git-scm.com/)

## Implementation

This project implements the following provided libraries:

* [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Testing](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html)(Which also contains other provided libraries)

## How to install it?

- Open at your preference terminal. 

- Download this project to your local.

```bash
git clone https://github.com/ivnfshz/hulu.git
```

- Finally, type the following command under the directory project:

```bash
mvn clean install
```

## Usage Details

### Run The Application

- Execute the application by running the following command:

```bash
mvn spring-boot:run
```
- Or if you prefer a different option, under the directory project type:

```bash
cd target/
```
- And then:

```bash
java -jar binary-tree-0.0.1-SNAPSHOT.jar
```

- Once you have run the above commands, you will be able to see the following information:

```bash
====================================
This is the binary tree:
Level: 2 Node: 3
Level: 1 Node: 5
Level: 2 Node: 12
Level: 0 Node: 15
Level: 1 Node: 66
Level: 2 Node: 75
====================================
Enter node A:
```
- It represents the binary tree that was loaded form a property source file. 

- If you are interested to change the values of each node, you could do it [here](https://github.com/ivnfshz/hulu#nodes)!

- As you can see, the program asks for a _value node_.

- Once you have entered the first value, you will be asked to enter the next _value node_ to validate them.
	- The program will validate if those nodes are cousins based on the binary tree shown before.

You will see a message with the result as the following example:

```bash
====================================
This is the binary tree:
Level: 2 Node: 3
Level: 1 Node: 5
Level: 2 Node: 12
Level: 0 Node: 15
Level: 2 Node: 50
Level: 1 Node: 66
Level: 2 Node: 75
====================================
Enter node A:
3
Enter node B:
50
====================================

Result: 3 is cousin of 50

====================================
```

- Or: 

```bash
====================================
This is the binary tree:
Level: 2 Node: 3
Level: 1 Node: 5
Level: 2 Node: 12
Level: 0 Node: 15
Level: 2 Node: 50
Level: 1 Node: 66
Level: 2 Node: 75
====================================
Enter node A:
3
Enter node B:
12
====================================

Result: 3 is NOT cousin of 12

====================================
``` 

### Unit Tests.

- If you want to run the unit tests of the application itself, then:

```bash
mvn test
```
### Nodes

- Got it! You just need to edit the next file located under directory project:

```bash
src/main/resources/nodes
```
	> It contains a key/value format. 
	> You will need to edit **root.nodes** key that you will be able to change.